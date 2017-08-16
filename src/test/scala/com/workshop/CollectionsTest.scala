package com.workshop

import com.workshop.Collections._
import org.specs2.mutable.Specification

class CollectionsTest extends Specification {


  "doubleEachElement" should {
    "double each element" in {
      doubleEachElement(Seq(1, 2, 3)) must be_===(Seq(2, 4, 6))
    }

    "onlySmaller" should {
      "keep only smaller integers" in {
        onlySmaller(Seq(1, 2, 3, 4, 5), 3) must be_===(Seq(1, 2))
      }
    }

    "keepOddNumberOnly" should {
      "keep only odd numbers" in {
        keepOddNumberOnly(Seq(1, 2, 3, 4, 5)) must be_===(Seq(1, 3, 5))
      }
    }

    "oddPositionsZeroBased" should {
      "take only elements in odd positions" in {
        oddPositionsZeroBased(Seq(0, 1, 2, 3, 4)) must be_===(Seq(1, 3))
      }
    }

    "longest" should {
      "return the longest String" in {
        val long = "longggg"
        longest(Seq("a", "b", long, "short", "sd")) must be_===(long)
      }
    }

    "isAllUpper" should {
      "return true for all upper string" in {
        isAllUpper("CAPS") must beTrue
      }

      "return false if contains non capital letter" in {
        isAllUpper("CApS") must beFalse
      }
    }

    "reverse" should {
      "reverse a sequence" in {
        println(s"reverse(Seq(1,2,3,4)) = ${reverse(Seq(1, 2, 3, 4))}")
        reverse(Seq(1,2,3,4)) must be_===(Seq(4,3,2,1))
      }
    }
  }
}