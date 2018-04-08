package com.mrmonksy.ninetyninescala

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    P05.reverse(list).equals(list)
  }
}
