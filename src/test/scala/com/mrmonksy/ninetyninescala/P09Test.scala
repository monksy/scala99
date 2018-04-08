package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P09Test extends WordSpec with Matchers {

  "P09Test::pack" should {


    "should handle an empty list" in {
      val input = List()
      val actual = P09.pack(input)
      val expected= List()

      actual should be (expected)
    }

    "should pack a non-duplicated list" in {
      val input = List(1,2,3)
      val actual = P09.pack(input)
      val expected= List(List(1), List(2), List(3))

      actual should be (expected)
    }

    "should handle the sample" in {

      val input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val actual = P09.pack(input)
      val expected= List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

      actual should be (expected)

    }
  }
}
