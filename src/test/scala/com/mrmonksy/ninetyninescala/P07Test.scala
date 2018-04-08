package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P07Test extends WordSpec with Matchers {

  "P07Test::flatten" should {

    "should flatten the sample" in {
      val input = List(List(1, 1), 2, List(3, List(5, 8)))
      val actual = P07.flatten(input)
      val expected = List(1, 1, 2, 3, 5, 8)

      actual should be (expected)
    }

  }
}
