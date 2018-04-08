package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P05Test extends WordSpec with Matchers {

  "P05Test" should {

    "reverse for empty" in {
      val input = List[Int]()
      val actual = P05.reverse(input)
      val expected = List[Int]()

      actual should be(expected)
    }

    "reverse for one element" in {
      val input = List[Int](5)
      val actual = P05.reverse(input)
      val expected = List[Int](5)

      actual should be(expected)
    }

    "reverse for sample" in {
      val input = List(1, 1, 2, 3, 5, 8)
      val actual = P05.reverse(input)
      val expected = List(8, 5, 3, 2, 1, 1)

      actual should be(expected)
    }


  }
}
