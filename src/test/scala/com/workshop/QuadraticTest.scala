package com.workshop

import org.specs2.mutable.Specification
import Quadratic._


class QuadraticTest extends Specification {
  "solve" should {
    "have no solutions" in {
      solve(1, -2, 2) must beEmpty
    }

    "have one solutions" in {
      solve(1, 2, 1) must contain(exactly(-1d))
    }

    "have multiple solutions" in {
      solve(1, 4, 3) must contain(exactly(-1d, -3d))
    }
  }
}
