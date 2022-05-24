package edu.udel.blc.ast.opt

import edu.udel.blc.ast.*
import edu.udel.blc.semantic_analysis.scope.Scope
import edu.udel.blc.semantic_analysis.scope.Symbol
import edu.udel.blc.util.uranium.Reactor
import edu.udel.blc.util.visitor.ValuedVisitor
import java.util.logging.Logger

class Optimizer : ValuedVisitor<Node, Node>() {

    /**
    TODO:
     * ~~Constant Folding~~
     * Strength Reduction
     * ~~Deadcode Elimination~~

    Use ValuedVisitor to walk tree and return new AST node tree

    Make O0 extension of Optimizer class
     */

    companion object {
        val LOG = Logger.getLogger("global") // TODO: set logger level in command line
    }
    
    val variables1:MutableMap<Symbol, Node>
    val variables2:MutableMap<Symbol, Node>
    private var passes = 0;
    private lateinit var symboltable: Reactor

    init {
        this.variables1 = mutableMapOf<Symbol, Node>()
        this.variables2 = mutableMapOf<Symbol, Node>()
        register(FunctionDeclarationNode::class.java, ::functionDeclaration)
        register(VariableDeclarationNode::class.java, ::variableDeclaration)

        // statements
        register(BlockNode::class.java, ::block)
        register(ExpressionStatementNode::class.java, ::expressionStatement)
        register(IfNode::class.java, ::`if`)
        register(ReturnNode::class.java, ::`return`)
        register(WhileNode::class.java, ::`while`)

        register(ArrayLiteralNode::class.java, ::arrayLiteral)
        register(BooleanLiteralNode::class.java, ::booleanLiteral)
        register(IntLiteralNode::class.java, ::intLiteral)
        register(StringLiteralNode::class.java, ::stringLiteral)
        register(UnitLiteralNode::class.java, ::unitLiteral)

        register(AssignmentNode::class.java, ::assignment)
        register(BinaryExpressionNode::class.java, ::binaryExpression)
        register(CallNode::class.java, ::call)
        register(FieldSelectNode::class.java, ::fieldSelect)
        register(IndexNode::class.java, ::index)
        register(ReferenceNode::class.java, ::reference)
        register(UnaryExpressionNode::class.java, ::unaryExpression)

//                register(CompilationUnitNode::class.java, ::compilationUnit)

    }

    /**
     * take a CompilationUnitNode optimize based on the symboltable and the number of pass
     *
     * @param node the CompilationUnitNode
     * @param symboltable
     * @param numpass number of pass
     * @return a optimized CompilationUnitNode
     */
    fun optimize(node: CompilationUnitNode, symboltable: Reactor, numpass: Int): CompilationUnitNode {
        this.symboltable = symboltable

        var newStatements = buildList {
            node.statements.forEach { add(apply(it) as StatementNode) }
        }
        //TODO: Refactor
        //Set the number of passes using a (optional) cli argument.

        // now the variables is filled with constant variables
        for (i in 1..numpass) {
            passes += 1
            newStatements = buildList { // do optimization again
                newStatements.forEach { add(apply(it) as StatementNode) }
            }
            if(passes % 2 == 0) {
                variables1.clear()
            }else{
                variables2.clear()
            }
        }
        return CompilationUnitNode(node.range, newStatements)
    }

    private fun index(node: IndexNode): Node {
        return node
    }

    private fun reference(node: ReferenceNode): Node {
        return node
    }

    private fun optConstReference(node: Node): Node {
        if (node !is ReferenceNode) return node
        if (passes == 0) return node
        val symbol = symboltable.get<Symbol>(node, "symbol")
        var returnValue: Node? = null
        if(passes % 2 == 0) {
            if(variables1.contains(symbol)) {
                LOG.fine("optimize constant references: ${variables1.get(symbol)} ${symbol} ${symbol.containingScope}")
                returnValue = variables1.get(symbol)
            }
        }else{
            if(variables2.contains(symbol)) {
                LOG.fine("optimize constant references: ${variables2.get(symbol)} ${symbol} ${symbol.containingScope}")
                returnValue = variables2.get(symbol)
            }
        }
        if(returnValue != null) return returnValue
        return node
    }

    private fun unaryExpression(node: UnaryExpressionNode): Node { //
        val opr = node.operator
        val opd = optConstReference(this.apply(node.operand)) // resolve operand

        val newNode = when { // TODO: code refactoring
            (opd is IntLiteralNode && opr == UnaryOperator.NEGATION) -> {
                LOG.fine("(Constant folding) ${opr} ${opd.value} ")
                IntLiteralNode(node.range, -opd.value)
            }
            (opd is BooleanLiteralNode) -> {
                when (opr) {
                    (UnaryOperator.LOGICAL_COMPLEMENT) -> {
                        LOG.fine("(Constant folding) ${opr} ${opd.value} ")
                        BooleanLiteralNode(node.range, !opd.value)
                    }
                    else -> {
                        node
                    }
                }
            }
            else -> {
                node
            }
        }
        return newNode
    }

    private fun stringLiteral(node: StringLiteralNode): Node {
        return node
    }

    private fun fieldSelect(node: FieldSelectNode): Node {
        return node
    }

    private fun call(node: CallNode): Node {
//                println(node)
//                println(node.callee)
//                println(node.arguments)
        val newArgs = buildList {
            node.arguments.forEach { add(apply(it) as ExpressionNode) }
        }

        val newNode = CallNode(node.range, node.callee, newArgs)

        return newNode
    }

    private fun binaryExpression(node: BinaryExpressionNode): Node {
        val l = optConstReference(this.apply(node.left))
        val r = optConstReference(this.apply(node.right))

        val newNode = when {
            //(l is IntLiteralNode && r is IntLiteralNode) ->
            (l is IntLiteralNode && r is IntLiteralNode) -> constFoldBinExpressInt(node, l, r)
            (l is BooleanLiteralNode && r is BooleanLiteralNode) -> constFoldBinExpressBool(node, l, r)
            else -> {
                node
            }
        }
        return newNode
    }

    private fun assignment(node: AssignmentNode): Node {
//        if(node.lvalue is ReferenceNode) {
//            println("assignment")
//            println(node.lvalue.name)
//            println(symboltable.get<Scope>(node.lvalue, "scope"))
//            println(symboltable.get<Symbol>(node.lvalue, "symbol"))
//            println(symboltable.get<Symbol>(node.lvalue, "symbol").name)
//            println(symboltable.get<Symbol>(node.lvalue, "symbol").containingScope)
//            println("---")
//        }
        val symbol = symboltable.get<Symbol>(node.lvalue, "symbol")
        if(passes % 2 == 1) {
            if(node.lvalue is ReferenceNode && variables1.contains(symbol)) {
                LOG.fine(" variable ${node.lvalue.name} in ${symbol.containingScope} reassigned (not constant)")
                variables1.remove(symbol)
            }
        }else{
            if(node.lvalue is ReferenceNode && variables2.contains(symbol)) {
                LOG.fine(" variable ${node.lvalue.name} in ${symbol.containingScope} reassigned (not constant)")
                variables2.remove(symbol)
            }
        }

        return node
    }

    private fun unitLiteral(node: UnitLiteralNode): Node {
        return node
    }

    private fun intLiteral(node: IntLiteralNode): Node {
        return node
    }

    private fun booleanLiteral(node: BooleanLiteralNode): Node {
        return node
    }

    private fun arrayLiteral(node: ArrayLiteralNode): Node {
        return node
    }

    // TODO: fix failing constant propogation 2 test
    private fun `while`(node: WhileNode): Node {
        val newnode = WhileNode(node.range,node.condition,apply(node.body) as StatementNode)
        return newnode
    }

    private fun `return`(node: ReturnNode): Node {
        return node
    }

    private fun `if`(node: IfNode): Node {
        val newcondition = this.apply(node.condition) as ExpressionNode

        // TODO: does blc support short circuit?
        if (newcondition is BooleanLiteralNode) { // deadcode elimination
            LOG.fine(" deadcode elimiation for if condition ${newcondition} ")
            if (newcondition.value) {
                return this.apply(node.thenStatement)
            } else {
                // TODO!!
                // since else is optional in if, we need to check if it is null
                // What should we return if else is null?
                // return null?
                // return empty expression?
                // how can/do we remove the if
                // Note: elseStatement has the type `StatementNode?`, see question mark usage
                // in https://kotlinlang.org/docs/null-safety.html
                if (node.elseStatement != null) {
                    return this.apply(node.elseStatement)
                }
            }
        }
        return IfNode(node.range, newcondition, node.thenStatement, node.elseStatement) // fallback
    }

    private fun expressionStatement(node: ExpressionStatementNode): Node {
        return ExpressionStatementNode(node.range, this.apply(node.expression) as ExpressionNode)
    }

    private fun block(node: BlockNode): Node {
        val newStatements = buildList {
            node.statements.forEach { add(apply(it) as StatementNode) }
        }
        val newnode = BlockNode(node.range, newStatements)
        return newnode
    }

    private fun variableDeclaration(node: VariableDeclarationNode): Node {
        val newInitializer = optConstReference(apply(node.initializer)) as ExpressionNode
        node.initializer = newInitializer
        if(node.type is ReferenceNode){
            val symbol = symboltable.get<Symbol>(node, "symbol")
            if (node.initializer is IntLiteralNode || node.initializer is BooleanLiteralNode || node.initializer is StringLiteralNode) {
                if(passes % 2 == 1) {
                    variables1.set(symbol, node.initializer)
                }else{
                    variables2.set(symbol, node.initializer)
                }
            }
//            variables.add(Variable(name,scope))
//            println("variableDeclaration")
//            println(node.name)
//            println(symboltable.get<Scope>(node, "scope"))
//            println(symboltable.get<Symbol>(node, "symbol"))
//            println(symboltable.get<Symbol>(node, "symbol").name)
//            println(symboltable.get<Symbol>(node, "symbol").containingScope)
//            println(symboltable.get<Scope>(node.type, "scope"))
//            println(symboltable.get<Symbol>(node.type, "symbol"))
//            println(symboltable.get<Symbol>(node.type, "symbol").name)
//            println(symboltable.get<Symbol>(node.type, "symbol").containingScope)
//            println("---")
        }

        return node
    }

    fun functionDeclaration(node: FunctionDeclarationNode): Node {
        val newBody = apply(node.body) as BlockNode
//        val newnode = FunctionDeclarationNode(node.range, node.name, node.parameters, node.returnType, node.body)
        node.body = newBody
        return node // TODO investigate issue with newnode
    }

    /********************
     * Helper functions *
     *******************/

    private fun constFoldBinExpressInt(node: BinaryExpressionNode, l: IntLiteralNode, r: IntLiteralNode): Node {
        LOG.fine("(Constant folding) ${l.value} ${node.operator} ${r.value} ")
        val newNode = when (node.operator) {  // TODO: figure out what's the range, range chr in source?
            BinaryOperator.ADDITION -> IntLiteralNode(node.range, l.value + r.value)
            BinaryOperator.SUBTRACTION -> IntLiteralNode(node.range, l.value - r.value)
            BinaryOperator.MULTIPLICATION -> IntLiteralNode(node.range, l.value * r.value)
            BinaryOperator.REMAINDER -> IntLiteralNode(node.range, l.value % r.value)
            // what's the operation for division?
            BinaryOperator.EQUAL_TO -> BooleanLiteralNode(node.range, l.value == r.value)
            BinaryOperator.NOT_EQUAL_TO -> BooleanLiteralNode(node.range, l.value != r.value)
            BinaryOperator.GREATER_THAN -> BooleanLiteralNode(node.range, l.value > r.value)
            BinaryOperator.GREATER_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value >= r.value)
            BinaryOperator.LESS_THAN -> BooleanLiteralNode(node.range, l.value < r.value)
            BinaryOperator.LESS_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value <= r.value)
            else -> node
        }
        return newNode
    }

    private fun constFoldBinExpressBool(
        node: BinaryExpressionNode,
        l: BooleanLiteralNode,
        r: BooleanLiteralNode
    ): Node {
        LOG.fine("(Constant folding) ${l.value} ${node.operator} ${r.value} ")
        val newNode = when (node.operator) {
            BinaryOperator.EQUAL_TO -> BooleanLiteralNode(node.range, l.value == r.value)
            BinaryOperator.NOT_EQUAL_TO -> BooleanLiteralNode(node.range, l.value != r.value)
            BinaryOperator.GREATER_THAN -> BooleanLiteralNode(node.range, l.value > r.value)
            BinaryOperator.GREATER_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value >= r.value)
            BinaryOperator.LESS_THAN -> BooleanLiteralNode(node.range, l.value < r.value)
            BinaryOperator.LESS_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value <= r.value)
            else -> node
        }
        return newNode
    }


}
