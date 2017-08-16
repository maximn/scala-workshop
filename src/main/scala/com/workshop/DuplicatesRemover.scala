package com.workshop

// wanna try to do it in an immutable way?
// go over the list recursively -
//   for each item check if in contained in a `seen` Set
//   if no - add the item to the `seen` list and to the result Seq
//      yes - skip it and continue traversing the Seq
class DuplicatesRemover {
  def remove(seq: Seq[Int]): Seq[Int] = ???
}
