package com.workshop

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

import scala.util.Random

class FrequencyMapTest extends Specification {

  class Context extends Scope {
    val frequency = new FrequencyMap

    val frequencies = Seq(
      'a' -> Random.nextInt(1000),
      'b' -> Random.nextInt(1000))

    val dummyText: String =
      Random.shuffle(
        frequencies.flatMap {
          case (char, count) => Seq.fill(count)(char)
        }).mkString("")
  }

  "generate" should {
    "create a frequencies map" in new Context {
      frequency.generate(dummyText) must havePairs(frequencies: _*)
    }
  }
}
