package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P02Test extends WordSpec with Matchers {


  "P02Test::penultimate" should {

    "work with the sample" in {
val input = List(1, 1, 2, 3, 5, 8)
      val actual = P02.penultimate(input)
      val expected = 5

      actual should be (expected)
    }

  }
}
