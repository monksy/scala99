package com.mrmonksy.ninetyninescala

object P02 {
  def penultimate[T](items: List[T]): T = {
    items.takeRight(2).head
  }
}
