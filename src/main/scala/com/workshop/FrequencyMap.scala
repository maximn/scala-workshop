package com.workshop

// String can be used as a Seq[Char]
// groupBy works on a Seq. You provide a function that defines a key for each element.
//   Then it builds a map Key -> Seq(Elements with that key)
// mapValues works on a map and run a function on all the values on the map.
class FrequencyMap {
  def generate(str: String): Map[Char, Int] = ???
}
