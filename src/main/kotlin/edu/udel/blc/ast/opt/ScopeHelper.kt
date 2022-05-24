package edu.udel.blc.ast.opt;

import edu.udel.blc.semantic_analysis.scope.Scope

data class Variable(val name: String, val scope: Scope)