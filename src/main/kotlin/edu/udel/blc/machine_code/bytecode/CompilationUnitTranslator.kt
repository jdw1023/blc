package edu.udel.blc.machine_code.bytecode

import edu.udel.blc.ast.CompilationUnitNode
import edu.udel.blc.util.uranium.Reactor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Type.*
import java.util.function.Function


class CompilationUnitTranslator(
    private val compilationUnitName: String,
    private val reactor: Reactor,
) : Function<CompilationUnitNode, Bytecode> {

    private val clazzType = getType("L$compilationUnitName;")

    override fun apply(node: CompilationUnitNode): Bytecode {

	// Scans the file for Struct Definition Nodes and generates the bytecode for them
        val structs = StructTranslator(reactor).apply(node)

	// Generates a Main class with all the code of the given file put into it
        val mainclass = buildClass(
            access = ACC_PUBLIC,
            name = compilationUnitName
        ) { clazz ->

	    // Generate the built-in functions and insert them at the beginning of the bytecode
            generateBuiltins(clazz)

            // main
            clazz.buildMethod(
                access = ACC_PUBLIC or ACC_STATIC,
                method = "void main(String[])",
            ) { method ->
                val visitor = StatementVisitor(clazzType, clazz, method, reactor)
                node.statements.forEach { visitor.accept(it) }
                method.returnValue()
            }

        }

        return Bytecode(mainclass, structs)
    }

    private fun generateBuiltins(clazz: ClassWriter) {
	
	// public static int len(ArrayList)
        clazz.buildMethod(
            access = ACC_PUBLIC or ACC_STATIC,
            method = "Long len(java.util.ArrayList)"
        ) { method ->
            method.loadArg(0)
            method.invokeVirtual(java_util_ArrayList, "int size()")
            method.cast(INT_TYPE, LONG_TYPE)
            method.box(LONG_TYPE)
            method.returnValue()
        }
	
	// public static String str(Object)
        clazz.buildMethod(
            access = ACC_PUBLIC or ACC_STATIC,
            method = "String str(Object)"
        ) { method ->
            method.loadArg(0)
            method.push("unit")
            method.invokeStatic(java_util_Objects, "String toString(Object, String)")
            method.returnValue()
        }

	// public static void print(Object)
        clazz.buildMethod(
            access = ACC_PUBLIC or ACC_STATIC,
            method = "Void print(Object)"
        ) { method ->
            method.getStatic(java_lang_System, "out", java_io_PrintStream)
            method.loadArg(0)
            method.invokeStatic(clazzType, "String str(Object)")
            method.invokeVirtual(java_io_PrintStream, "void println(String)")
            method.push(null as String?)
            method.returnValue()
        }

	// public static String concat(String, String)
        clazz.buildMethod(
            access = ACC_PUBLIC or ACC_STATIC,
            method = "String concat(String, String)"
        ) { method ->
            method.newInstance(java_lang_StringBuilder)
            method.dup()
            method.invokeConstructor(java_lang_StringBuilder, "void <init>()")
            method.loadArg(0)
            method.invokeVirtual(java_lang_StringBuilder, "StringBuilder append(String)")
            method.loadArg(1)
            method.invokeVirtual(java_lang_StringBuilder, "StringBuilder append(String)")
            method.invokeVirtual(java_lang_StringBuilder, "String toString()")
            method.returnValue()
        }
    }

}
