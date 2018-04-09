package com.mrmonksy.ninetyninescala

import scala.annotation.tailrec

object P13 {
  def encodeDirect[T](values: List[T]): List[(Int, T)] = {
    @tailrec
    def encodeInner(values:List[T], result:List[(Int,T)]): List[(Int,T)]= {
      if (values.isEmpty) return result.reverse
      val firstItem = values.head
      val sections = values.span(firstItem == _)

      val summerizedValues = sections._1
      encodeInner(sections._2, (summerizedValues.size, summerizedValues.head) :: result)
    }

    encodeInner(values, List())
  }
}
