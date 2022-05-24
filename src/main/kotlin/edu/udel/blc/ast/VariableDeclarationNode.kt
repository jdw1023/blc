package edu.udel.blc.ast


class VariableDeclarationNode(
    range: IntRange,
    val name: String,
    val type: Node,
    var initializer: ExpressionNode,
) : StatementNode(range)