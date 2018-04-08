package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P04Test extends WordSpec with Matchers {

  "P04Test" should {

    "length" in {

      val input = List(1, 1, 2, 3, 5, 8)
      val expected = 6
      val actual = P04.length(input)

      actual should be (expected)
    }

  }
}
