package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P14Test extends WordSpec with Matchers {

  "P14Test::duplicate" should {

    "should handle empty lists" in {
      val input = List()
      val expected = List()
      val actual = P14.duplicate(input)

      actual should be(expected)
    }
    "should handle sample" in {
      val input = List('a, 'b, 'c, 'c, 'd)
      val expected = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
      val actual = P14.duplicate(input)

      actual should be(expected)
    }

  }
}
