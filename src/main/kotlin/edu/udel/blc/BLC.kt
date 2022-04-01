package edu.udel.blc

import com.github.ajalt.clikt.completion.completionOption
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.context
import com.github.ajalt.clikt.output.CliktHelpFormatter
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.groups.defaultByName
import com.github.ajalt.clikt.parameters.groups.groupChoice
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file
import edu.udel.blc.ast.CompilationUnitNode
import edu.udel.blc.ast.ExpressionNode
import edu.udel.blc.ast.Node
import edu.udel.blc.ast.StatementNode
import edu.udel.blc.ast.opt.Optimizer
import edu.udel.blc.machine_code.MachineCode
import edu.udel.blc.machine_code.bytecode.BytecodeGenerator
import edu.udel.blc.parse.antlr.AntlrBasedParser
import edu.udel.blc.parse.hand_written.HandWrittenParser
import edu.udel.blc.semantic_analysis.SemanticAnalysis
import edu.udel.blc.util.LineMap
import edu.udel.blc.util.TreeFormatter
import java.io.File

class BLC : CliktCommand() {

    init {
        context { helpFormatter = CliktHelpFormatter(showDefaultValues = true) }
    }

    private val input by argument()
        .file(mustExist = true, mustBeReadable = true, canBeDir = false)

    private val parser by option("-p", "--parser").groupChoice(
        "antlr" to AntlrBasedParser(),
        "handwritten" to HandWrittenParser()
    ).defaultByName("handwritten")

    private val target by option("-t", "--target").groupChoice(
        "bytecode" to BytecodeGenerator(),
    ).defaultByName("bytecode")

    //TODO: some how config optimizer
//    private val optimizer by option("-O", "--Optimize").groupChoice(
//        "0" to Optimizer(),
//        "1" to Optimizer(),
//    ).defaultByName("optimize")
    private val optimize by option("--optimize", help = "optimize ?")
        .flag(default = false, defaultForHelp = "false")

    private val printAst by option("--print-ast", help = "Print the abstract syntax tree")
        .flag(default = false, defaultForHelp = "false")

    private val output by option("-o", "--output", help = "Location to store binary")
        .file(mustBeWritable = true, mustExist = false)


    private fun onSuccess(codeGenerationResult: MachineCode) {
        val outFile = output ?: File("${input.nameWithoutExtension}.${target.extension}")
        codeGenerationResult.writeTo(outFile)
    }

    private fun reportErrors(errors: Set<BaseError>) {
        val lineMap = LineMap(input.name, input.readText())
        errors.forEach { error ->
            val position = lineMap.stringWithName(error.range.first)
            System.err.println(lineMap.lineSnippet(error.range.first))
            System.err.println("[$position]: ${error.message}")
        }
    }

    override fun run() {

        val source = input.readText()

        val result = binding {
            var compilationUnit = parser.apply(source).bind()

//            if (printAst) {
//                TreeFormatter.appendTo(System.out, compilationUnit, Node::class.java)
//            }

            val symboltable = SemanticAnalysis.apply(compilationUnit).bind()

            // TODO: Add Optimizer code here w/ command flag
            if (optimize) {
                val optimizer = Optimizer()

                compilationUnit = optimizer.optimize(compilationUnit)
            }

            if (printAst) {
                TreeFormatter.appendTo(System.out, compilationUnit, Node::class.java)
            }

            target.apply(symboltable, compilationUnit).bind()
        }

        result
            .onSuccess(::onSuccess)
            .onFailure(::reportErrors)
    }

}


fun main(args: Array<String>) = BLC().main(args)





