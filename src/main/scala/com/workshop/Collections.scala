package com.workshop

object Collections {
  // map (1, 2, 3) -> (2, 4, 6)
  def doubleEachElement(seq: Seq[Int]): Seq[Int] = ???

  // filter
  def onlySmaller(seq: Seq[Int], smallerThan: Int): Seq[Int] = ???

  // filter
  def keepOddNumberOnly(seq: Seq[Int]): Seq[Int] = ???

  // maxBy
  def longest(seq: Seq[String]): String = ???

  // forAll, Char.isUpper
  def isAllUpper(str: String): Boolean = ???

  // zipWithIndex, filter, map. filter&map = collect
  def oddPositionsZeroBased(seq: Seq[Int]): Seq[Int] = ???

  // recursion - make a call that will remove an item and put on the other side of the Seq
  def reverse[T](seq: Seq[T]): Seq[T] = ???
}
