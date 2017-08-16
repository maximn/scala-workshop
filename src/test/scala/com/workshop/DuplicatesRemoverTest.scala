package com.workshop

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class DuplicatesRemoverTest extends Specification {

  class Context extends Scope {
    val remover = new DuplicatesRemover
    val noDuplicates: Seq[Int] = 1 to 20
    val withDuplicates = noDuplicates ++ noDuplicates.reverse
  }

  "remove" should {
    "return same seq when no duplicates" in new Context {
      remover.remove(noDuplicates) must be_===(noDuplicates)
    }

    "remove the duplicates and keep the order" in new Context {
      remover.remove(withDuplicates) must be_===(noDuplicates)
    }

    "return empty seq for empty input" in new Context {
      remover.remove(Seq.empty) must be_===(Seq.empty)
    }
  }
}
