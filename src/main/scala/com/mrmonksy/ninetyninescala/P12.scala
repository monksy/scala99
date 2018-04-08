package com.mrmonksy.ninetyninescala

object P12 {
  def decode[T](values: List[(Int, T)]): List[T] = {
    values.flatMap(c => List.fill(c._1)(c._2))
  }
}
