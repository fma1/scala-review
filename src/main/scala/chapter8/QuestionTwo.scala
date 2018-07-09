package chapter8

import scala.annotation.tailrec

object QuestionTwo {
  sealed trait Node
  case class RealNode[A](var data: A, var next: Node) extends Node
  object EndOfList extends Node

  class MyLinkedList[A]() {

    var head: Node = null

    def this(items: A*) {
      this()

      var curr: Node = null

      for (i <- items) {
        if (this.head == null) {
          this.head = new RealNode(i, EndOfList)
          curr = head
        } else {
          curr.asInstanceOf[RealNode[A]].next = new RealNode(i, EndOfList)
          curr = curr.asInstanceOf[RealNode[A]].next
        }
      }
    }

    def this(head: Node) {
      this()
      head match {
        case RealNode(_, _) => this.head = head
        case EndOfList => ()
      }
    }

    def append(node: Node): MyLinkedList[A] = {
      var currOld: Node = this.head
      var currNew: Node = null
      var newHead: Node = null

      while (currOld != null) {
        currOld match {
          case RealNode(data, next) =>
            if (currNew == null) {
              currNew = new RealNode(data, next)
              newHead = currNew
            } else {
              currNew.asInstanceOf[RealNode[A]].next = new RealNode[A](data.asInstanceOf[A], next)
              currNew = currNew.asInstanceOf[RealNode[A]].next
            }
          case EndOfList =>
            if (currNew == null) {
              currNew = new RealNode[A](node.asInstanceOf[RealNode[A]].data.asInstanceOf[A], EndOfList)
              newHead = currNew
            } else {
              currNew.asInstanceOf[RealNode[A]].next = new RealNode[A](node.asInstanceOf[RealNode[A]].data.asInstanceOf[A], EndOfList)
            }
        }
      }

      new MyLinkedList[A](newHead)
    }

    def foreach(func: A => Unit) = {
      @tailrec
      def foreachHelper(curr: Node): Unit = {
        curr match {
          case RealNode(data, next) =>
            func(data.asInstanceOf[A])
            foreachHelper(next)
          case EndOfList => ()
        }
      }

      foreachHelper(head)
    }

    def tail = {
      val newLst = new MyLinkedList()
      newLst.head = this.head.asInstanceOf[RealNode[A]].next
      newLst
    }

    def filter(func: A => Boolean) = {
      def filterHelper(acc: MyLinkedList[A], origNode: Node): MyLinkedList[A] = {
        origNode match {
          case RealNode(data, next) =>
            if (func(data.asInstanceOf[A])) {
              filterHelper(acc.append(origNode), next)
            } else {
              filterHelper(acc, next)
            }
          case EndOfList => acc
        }
      }
      filterHelper(new MyLinkedList[A](), this.head)
    }

    def map[B](func: A => B) = {
      def mapHelper(acc: MyLinkedList[B], origNode: Node): MyLinkedList[B] = {
        origNode match {
          case RealNode(data, next) => mapHelper(acc.append(new RealNode[B](func(data.asInstanceOf[A]), EndOfList)), next)
          case EndOfList => acc
        }
      }
      mapHelper(new MyLinkedList[B](), this.head)
    }

    def equals(that: MyLinkedList[A]): Boolean = {
      def equalsHelper(thisCurr: Node, thatCurr: Node): Boolean = {
        thisCurr match {
          case RealNode(data1, next1) =>
            thatCurr match {
              case RealNode(data2, next2) =>
                if (data1 == data2) equalsHelper(next1, next2)
                else false
              case EndOfList => false
            }
          case EndOfList =>
            thatCurr match {
              case RealNode(data2, next2) => false
              case EndOfList => true
            }
        }
      }
      equalsHelper(this.head, that.head)
    }
  }

  object MyLinkedList {
    def apply[A](items: A*): MyLinkedList[A] = new MyLinkedList[A](items:_*)
  }
}
