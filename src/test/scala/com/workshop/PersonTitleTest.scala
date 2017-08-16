package com.workshop

import com.workshop.PersonTitle._
import org.specs2.mutable.Specification

class PersonTitleTest extends Specification {
  Seq(None, Some(Married), Some(Single)).foreach { status =>
    "male" should {
      s"called Mr when status - $status" in {
        genderTitle(Male, status) must be_===("Mr")
      }
    }
  }

  "female" should {
    "called Miss when single" in {
      genderTitle(Female, Some(Single)) must be_===("Miss")
    }

    "called Mrs when married" in {
      genderTitle(Female, Some(Married)) must be_===("Mrs")
    }

    "called Ms when status is unknown" in {
      genderTitle(Female, None) must be_===("Ms")
    }
  }
}