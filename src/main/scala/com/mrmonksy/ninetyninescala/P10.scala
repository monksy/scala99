package com.mrmonksy.ninetyninescala

object P10 {
  def encode[T](values: List[T]): List[(T, Int)] = {

    val packedResults = P09.pack(values)
    packedResults.map(a=>(a.head, a.size))
  }
}
