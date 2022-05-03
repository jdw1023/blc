package edu.udel.blc.ast

class ForNode(
    range: IntRange,
    val initializer: StatementNode,
    val condition: ExpressionNode,
    val modifier: ExpressionNode,
    val body: StatementNode,
) : StatementNode(range)