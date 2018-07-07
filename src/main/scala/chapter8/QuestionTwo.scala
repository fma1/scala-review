package chapter8

import scala.annotation.tailrec

object QuestionTwo {
  class MyLinkedList[A](items: A*) {
    sealed trait Node
    case class RealNode(var data: A, var next: Node) extends Node
    object EndOfList extends Node

    var head: Node = null
    var tail: Node = null

    for (i <- items) {
      if (head == null) {
        head = new RealNode(i, EndOfList)
        tail = head
      } else {
        tail.asInstanceOf[RealNode].next = new RealNode(i, EndOfList)
        tail = tail.asInstanceOf[RealNode].next
      }
    }

    def foreach(func: A => Unit) = {
      @tailrec
      def foreachHelper(curr: Node): Unit = {
        curr match {
          case RealNode(data, next) =>
            func(data)
            foreachHelper(next)
          case EndOfList => ()
        }
      }

      foreachHelper(head)
    }
  }

  object MyLinkedList {
    def apply[A](items: A*): MyLinkedList[A] = new MyLinkedList[A](items:_*)
  }
}
