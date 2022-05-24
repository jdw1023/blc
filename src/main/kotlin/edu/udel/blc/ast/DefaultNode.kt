package edu.udel.blc.ast


class DefaultNode (
    range: IntRange,
    val body: StatementNode,
) : StatementNode(range)
