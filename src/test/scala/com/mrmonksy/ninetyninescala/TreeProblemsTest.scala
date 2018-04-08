package com.mrmonksy.ninetyninescala

import org.scalatest.{Matchers, WordSpec}

class TreeProblemsTest extends WordSpec with Matchers {
  "TreeProblems::height" should {
    "calculate the height of a one node tree" in {
      val input = Node(2, null, null)
      val expected = 1

      val actual = TreeProblems.height(input)

      actual should be(expected)
    }

    "calculate the height of a two level tree" in {
      val input = Node(1, Node(2, null, null), Node(3, null, null))
      val expected = 2

      val actual = TreeProblems.height(input)

      actual should be(expected)
    }

    "calculate the height of a two level unbalenced" in {
      val input = Node(1, Node(2, null, null), null)
      val expected = 2

      val actual = TreeProblems.height(input)

      actual should be(expected)
    }

    "calculate the height of a four level with nodes missing in two" in {
      val input = Node(1, Node(2, Node(4, null, null), null), Node(3, Node(6, null, Node(10, null, null)), null))
      val expected = 4

      val actual = TreeProblems.height(input)

      actual should be(expected)
    }
  }
}
