package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P06Test extends WordSpec with Matchers {

  "P06Test::isPalindrome" should {

    "return true for an empty list" in {
      val input = List()
      val actual = P06.isPalindrome(input)
      val expected = true

      actual should be (expected)
    }

    "return false for a list that isn't" in {
      val input = List(5,3,2,1)
      val actual = P06.isPalindrome(input)
      val expected = false

      actual should be (expected)
    }

    "return true for a list that is" in {
      val input = List(1,2,3,2,1)
      val actual = P06.isPalindrome(input)
      val expected = true

      actual should be (expected)
    }

  }
}
