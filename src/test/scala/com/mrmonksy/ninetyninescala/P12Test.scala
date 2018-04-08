package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P12Test extends WordSpec with Matchers {

  "P12Test::decode" should {

    "Should handle an empty list" in {
      val input = List()
      val actual = P12.decode(input)
      val expected = List()

      actual should be(expected)
    }

    "Should handle the sample" in {
      val input = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val actual = P12.decode(input)
      val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

      actual should be(expected)
    }


  }
}
