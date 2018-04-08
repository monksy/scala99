package com.mrmonksy.ninetyninescala

import scala.annotation.tailrec

object P08 {
  /**
    * Eleminates all duplicates
    *
    * @param list
    * @tparam T
    * @return
    */
  def compress[T](list: List[T]): List[T] = {
    @tailrec
    def inner[T](list: List[T], results: List[T]): List[T] = {
      if (list.isEmpty) return results.reverse
      val itemToFind = list.head
      val found = list.span(itemToFind == _)
      inner(found._2, itemToFind :: results)
    }

    inner(list, List())
  }

}
