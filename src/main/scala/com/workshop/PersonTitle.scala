package com.workshop

object PersonTitle {
  // match on tuple of (gender, status)
  // take advantage of extractors
  def genderTitle(gender: Gender, status: Option[Status]): String = ???
}

sealed trait Gender

case object Male extends Gender

case object Female extends Gender

sealed trait Status

case object Married extends Status

case object Single extends Status

