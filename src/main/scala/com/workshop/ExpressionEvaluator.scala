package com.workshop


sealed trait Expression
case class Const(n: Int) extends Expression
case class Sum(a: Expression, b: Expression) extends Expression

// Use match case
// You know how to evaluate `Const`
// Sum of expressions is the sum of the evaluation of these expressions
object ExpressionEvaluator {
  def evaluate(expr: Expression): Int = ???
}
