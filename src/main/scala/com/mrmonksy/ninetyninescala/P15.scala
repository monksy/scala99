package com.mrmonksy.ninetyninescala

object P15 {
  def duplicateN[T](time: Int, source: List[T]): List[T] = {
    source.flatMap(c=>List.fill(time)(c))
  }
}
