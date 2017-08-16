package com.workshop

import org.specs2.mutable.Specification

class IsIncreasingTest extends Specification {
  val intSmaller = (a: Int, b: Int) => a < b
  val isSorted = new IsIncreasing[Int](intSmaller)

  "check" should {
    "be true for increasing seq" in {
      isSorted.check(Seq(1, 2, 3, 4)) must beTrue
    }

    "be false for non-sorted seq" in {
      isSorted.check(Seq(1, 2, 5, 3, 4)) must beFalse
    }

    "be false for reverse-sorted seq" in {
      isSorted.check(Seq(4, 3, 2, 1)) must beFalse
    }
  }
}
