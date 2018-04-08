package com.mrmonksy.ninetyninescala

import scala.annotation.tailrec

object P09 {
  /**
    * If a list contains repeated elements they should be placed in separate sublists.
    *
    * Example:
    *
    * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    *
    * @param list
    * @tparam T
    * @return
    */
  def pack[T](list: List[T]): List[List[T]] = {
    @tailrec
    def packInternal(rest:List[T], results:List[List[T]]): List[List[T]] = {
      if (rest.isEmpty) return results.reverse

      val sections = rest.span(rest.head == _)
      packInternal(sections._2, sections._1 :: results)
    }

    packInternal(list, List())

  }
}
