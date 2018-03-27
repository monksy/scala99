package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P01Test extends WordSpec with Matchers {

  "P01Test:findLastElementOfAList " should {

    "Get last in a sample" in {
      val input= List(1, 1, 2, 3, 5, 8)
      val expected = 8
      val actual = P01.last(input)

      actual should be (expected)
    }

  }
}
