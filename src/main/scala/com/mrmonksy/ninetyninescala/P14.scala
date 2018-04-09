package com.mrmonksy.ninetyninescala

object P14 {
  def duplicate[T](items: List[T]): List[T] = {
    items.flatMap(i=> List(i,i))
  }
}
