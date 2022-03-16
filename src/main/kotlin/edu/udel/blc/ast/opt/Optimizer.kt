package edu.udel.blc.ast.opt

import edu.udel.blc.ast.*
import edu.udel.blc.machine_code.bytecode.TypeUtils
import edu.udel.blc.semantic_analysis.scope.FunctionSymbol
import edu.udel.blc.semantic_analysis.scope.StructSymbol
import edu.udel.blc.semantic_analysis.scope.Symbol
import edu.udel.blc.semantic_analysis.type.FunctionType
import edu.udel.blc.semantic_analysis.type.StructType
import edu.udel.blc.util.visitor.ValuedVisitor
import org.objectweb.asm.Type
import org.objectweb.asm.commons.GeneratorAdapter
import org.objectweb.asm.commons.Method
import java.util.logging.Logger

class Optimizer : ValuedVisitor<Node, Node>() {

        /**
        TODO:
         * Constant Folding
         * Strength Reduction
         * Deadcode Elimination

        Use ValuedVisitor to walk tree and return new AST node tree

        Make O0 extension of Optimizer class
         */

        companion object {
                val LOG = Logger.getLogger(Optimizer::class.java.name)
        }

        init {
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

        }

        private fun index(node: IndexNode): Node {
                return node
        }

        private fun reference(node: ReferenceNode): Node {
                return node
        }

        private fun unaryExpression(node: UnaryExpressionNode): Node {
                return node
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
                val newArgs = buildList() {
                        node.arguments.forEach { add(apply(it) as ExpressionNode) }
                }

                val newNode = CallNode(node.range, node.callee, newArgs)

                return newNode
        }

        private fun binaryExpression(node: BinaryExpressionNode): Node {
                val l = this.apply(node.left)
                val r = this.apply(node.right)
                val newNode = when {
                        //(l is IntLiteralNode && r is IntLiteralNode) -> {
                        (l is IntLiteralNode && r is IntLiteralNode) -> {
                                LOG.info("(Constant folding) ${l.value} ${node.operator} ${r.value} ");
                                when (node.operator) {  // TODO: figure out what's the range, range chr in source?
                                        BinaryOperator.ADDITION -> IntLiteralNode(node.range ,l.value + r.value);
                                        BinaryOperator.SUBTRACTION -> IntLiteralNode(node.range ,l.value - r.value);
                                        BinaryOperator.MULTIPLICATION -> IntLiteralNode(node.range ,l.value * r.value);
                                        BinaryOperator.REMAINDER -> IntLiteralNode(node.range ,l.value % r.value); // what's the operation for division?

                                        BinaryOperator.EQUAL_TO -> BooleanLiteralNode(node.range ,l.value == r.value); // what's the operation for division?
                                        BinaryOperator.NOT_EQUAL_TO -> BooleanLiteralNode(node.range, l.value != r.value)
                                        BinaryOperator.GREATER_THAN -> BooleanLiteralNode(node.range, l.value > r.value)
                                        BinaryOperator.GREATER_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value >= r.value)
                                        BinaryOperator.LESS_THAN -> BooleanLiteralNode(node.range, l.value < r.value)
                                        BinaryOperator.LESS_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value <= r.value)
                                        else -> node
                                }
                        }
                        (l is BooleanLiteralNode  && r is BooleanLiteralNode ) -> { // TODO: code refactoring
                                LOG.info("(Constant folding) ${l.value} ${node.operator} ${r.value} ");
                                when (node.operator) {
                                        BinaryOperator.EQUAL_TO -> BooleanLiteralNode(node.range ,l.value == r.value); // what's the operation for division?
                                        BinaryOperator.NOT_EQUAL_TO -> BooleanLiteralNode(node.range, l.value != r.value)
                                        BinaryOperator.GREATER_THAN -> BooleanLiteralNode(node.range, l.value > r.value)
                                        BinaryOperator.GREATER_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value >= r.value)
                                        BinaryOperator.LESS_THAN -> BooleanLiteralNode(node.range, l.value < r.value)
                                        BinaryOperator.LESS_THAN_OR_EQUAL_TO -> BooleanLiteralNode(node.range, l.value <= r.value)
                                        else -> node
                                }
                        }
                        else -> { node }
                };
                return newNode
        }

        private fun assignment(node: AssignmentNode): Node {
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

        private fun `while`(node: WhileNode): Node {
                return node
        }

        private fun `return`(node: ReturnNode): Node {
                return node
        }

        private fun `if`(node: IfNode): Node {
                return node
        }

        private fun expressionStatement(node: ExpressionStatementNode): Node {
                return ExpressionStatementNode(node.range, this.apply(node.expression) as ExpressionNode)
        }

        private fun block(node: BlockNode): Node {
                return node
        }

        private fun variableDeclaration(node: VariableDeclarationNode): Node {
                return node
        }

        fun functionDeclaration(node: FunctionDeclarationNode): Node {
                return node
        }

}
