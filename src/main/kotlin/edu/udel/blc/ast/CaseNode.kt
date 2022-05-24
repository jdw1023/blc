package edu.udel.blc.ast

import edu.udel.blc.parse.hand_written.BaseToken

class CaseNode (
    range: IntRange,
    val case: ExpressionNode,
    val body: StatementNode,
) : StatementNode(range)
