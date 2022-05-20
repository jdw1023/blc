package edu.udel.blc.ast

class SwitchNode(
    range: IntRange,
    val cases: List<IfNode>,
    val default: DefaultNode,
) : StatementNode(range)