package com.mrmonksy.ninetyninescala

object P07 {
  /**
    * This is a flatten for a list. We're using an any because it could be any value.
    *
    * @param list
    * @return
    */
  def flatten(list: List[Any]): List[Any] = {
    list.flatMap(i=> i match {
      case a:List[_]=> flatten(a)
      case c => List(c)
    }

    )
  }
}
