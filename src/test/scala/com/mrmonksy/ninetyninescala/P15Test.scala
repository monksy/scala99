package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P15Test extends WordSpec with Matchers {

  "P15Test::duplicateN" should {

    "handle empty list" in {
      val input = List()
      val repeat = 2
      val expected = List()
      val actual = P15.duplicateN(repeat, input)

      actual should be(expected)
    }
    "handle sample, repeat 2" in {
      val input = List('a,'b)
      val repeat = 2
      val expected = List('a, 'a, 'b, 'b)
      val actual = P15.duplicateN(repeat, input)

      actual should be(expected)
    }
    "handle sample repeat3 " in {
      val input = List('a, 'b, 'c, 'c, 'd)
      val repeat = 3
      val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
      val actual = P15.duplicateN(repeat, input)

      actual should be(expected)
    }

  }
}
