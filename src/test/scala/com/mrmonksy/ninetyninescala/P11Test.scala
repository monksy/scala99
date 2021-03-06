package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class P11Test extends WordSpec with Matchers {

  "P11Test::encodeModified" should {

    "should handle an empty list" in {
      val input = List()
      val actual = P11.encodeModified(input)
      val expected = List()

      actual should be(expected)
    }

    "Should handle a non duplicated list" in {
      val input = List(1, 2)
      val actual = P11.encodeModified(input)
      val expected = List(1,2)

      actual should be(expected)
    }

    "Should handle a duplicated list" in {
      val input = List(1, 2, 2, 2, 1)
      val actual = P11.encodeModified(input)
      val expected = List(1, (2, 3), 1)

      actual should be(expected)
    }


  }
}
