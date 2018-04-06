package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P03Test extends WordSpec with Matchers {

  "P03Test" should {

    "nth" in {
      val expected = 2
      val actual = P03.nth(2, List(1, 1, 2, 3, 5, 8))
      actual should be (expected)
    }

  }
}
