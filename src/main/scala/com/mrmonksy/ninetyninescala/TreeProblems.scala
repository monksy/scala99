package com.mrmonksy.ninetyninescala

import scala.collection.mutable

object TreeProblems {

  def height(node: Node): Long = {
    var topHeight = 1
    val storage = mutable.Queue[(Node, Int)]((node, 1))

    while (!storage.isEmpty) {
      val currentItem = storage.dequeue()
      if (currentItem._1 != null) {
        topHeight = topHeight.max(currentItem._2)

        //Add the children
        storage.enqueue((currentItem._1.l, currentItem._2 + 1))
        storage.enqueue((currentItem._1.r, currentItem._2 + 1))
      }
    }

    topHeight
  }

  //TODO: Is a tree balenced

  //TODO: Sum of a tree
  //TODO: Printing out all levels with seperation
  //TODO: Find value
}

case class Node(value: Int, l: Node, r: Node)
