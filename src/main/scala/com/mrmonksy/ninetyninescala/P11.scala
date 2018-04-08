package com.mrmonksy.ninetyninescala

object P11 {
  def encodeModified[T](values: List[T]): List[Any] = {
    val packedResults = P09.pack(values)
    packedResults.asInstanceOf[List[Any]].map(v=> v match {
      case a:List[T] if a.size == 1 => a.head
      case c:List[T] => (c.head, c.size)
    } )
  }
}
