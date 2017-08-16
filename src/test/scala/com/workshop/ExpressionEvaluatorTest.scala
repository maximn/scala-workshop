package com.workshop

import org.specs2.mutable.Specification
import ExpressionEvaluator._

class ExpressionEvaluatorTest extends Specification {

  "eval" should {
    "evaluate constant" in {
      val n = 5
      evaluate(Const(n)) must be_===(n)
    }

    "evaluate Sum" in {
      val a = Const(2)
      val b = Const(3)
      evaluate(Sum(a, b)) must be_===(5)
    }
  }
}