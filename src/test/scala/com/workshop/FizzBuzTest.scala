package com.workshop

import org.specs2.mutable.Specification
import FizzBuz._

class FizzBuzTest extends Specification {
  "divisible by 3 and 5" should {
    "return FizzBuzz" in {
      eval(15) must be_===("FizzBuzz")
    }
  }

  "divisible by 3" should {
    "return Fizz" in {
      eval(3) must be_===("Fizz")
    }
  }

  "divisible by 5" should {
    "return FizzBuzz" in {
      eval(5) must be_===("Buzz")
    }
  }

  "non divisible by 3 or 5" should {
    "return itself" in {
      eval(1) must be_===("1")
    }
  }
}
