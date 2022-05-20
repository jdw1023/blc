package edu.udel.blc.ast

class ForNode(
    range: IntRange,
    val variable: StatementNode,
    val condition: ExpressionNode,
    val modifier: StatementNode,
    val body: StatementNode,
) : StatementNode(range)