package com.workshop

import org.specs2.mutable.Specification

class LongestSubstringTest extends Specification {
  "find" should {
    "find longest string with upper&lower case but not numbers" in {
       LongestSubstring.find("aV3rwerwr6Wix") must be_===("Wix")
    }
  }
}

