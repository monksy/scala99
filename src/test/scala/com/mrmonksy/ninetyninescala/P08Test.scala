package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P08Test extends WordSpec with Matchers {

  "P08Test::compress" should {

    "work for an already compressed list" in {
      val input = List(1, 2, 3, 4)
      val actual = P08.compress(input)
      val expected = input

      actual should be(expected)
    }

    "compress a string that contains duplicates" in {
      val input = List(1, 1, 2, 2, 3, 4, 4, 4, 5)
      val actual = P08.compress(input)
      val expected = List(1,2,3,4,5)

      actual should be(expected)
    }


  }
}
