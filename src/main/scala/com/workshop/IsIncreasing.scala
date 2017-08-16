package com.workshop

// You can use recursion to check the first two items if increasing, then call recursively without the element that changed.
// Another option, use sliding window (.sliding)
class IsIncreasing[T](isSmaller: (T, T) => Boolean) {
  def check(seq: Seq[T]): Boolean = ???
}
