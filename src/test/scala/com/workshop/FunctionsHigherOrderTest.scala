package com.workshop

import com.workshop.FunctionsHigherOrder._
import org.specs2.mutable.Specification

class FunctionsHigherOrderTest extends Specification {
  "multiply" should {
    "return the mult of two integers" in {
      multiply(4, 5) must be_===(20)
    }
  }

  "sum" should {
    "return the sum of two integers" in {
      sum(4, 5) must be_===(9)
    }
  }

  "plusOne" should {
    "add 1 to a given number" in {
      plusOne(6) must be_===(7)
    }
  }

  "sumSeq" should {
    "sum all numbers" in {
      sumSeq(numbers) should be_===(10)
    }
  }


  "sumDoubles" should {
    "sum all doubles of the numbers" in {
      sumDoubles(numbers) should be_===(20)
    }
  }

  "sumSquares" should {
    "sum all squares of the numbers" in {
      sumSquares(numbers) should be_===(30)
    }
  }
}
