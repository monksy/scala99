package com.mrmonksy.ninetyninescala

object P03 {

  /**
    * Find the Kth element of a list.
    * By convention, the first element in the list is element 0.
    *
    * @param index The item to get.
    * @param list The list that contains all of the data.
    * @tparam T The type of the item in the list.
    * @return Returns the nth item in the list from the left.
    */
  def nth[T](index:Int, list: List[T]):T= {
    list(index)
  }
}
