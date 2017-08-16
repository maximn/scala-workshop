package com.workshop

import org.scalacheck.Gen
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class FibonacciTest extends Specification with ScalaCheck {
  val fib: Fibonacci = new Fibonacci

  "negative input" should {
    "be invalid" in {
      fib.nth(-1) must throwAn[IllegalArgumentException]
    }
  }

  "0th" should {
    "be 0" in {
      fib.nth(0) must be_===(0)
    }
  }

  "1st" should {
    "be 1" in {
      fib.nth(1) must be_===(1)
    }
  }

  "2nd" should {
    "be 1" in {
      fib.nth(2) must be_===(1)
    }
  }

  "3rd" should {
    "be 2" in {
      fib.nth(3) must be_===(2)
    }
  }

  "fib(n)" should {
    "be equal to the sum of the results of last 2 elements" >> prop { n: Int =>
      fib.nth(n) must be_===(fib.nth(n - 1) + fib.nth(n - 2))
    }.setGen(Gen.choose[Int](2, 30))
  }
}
