package chapter7

import scala.collection.mutable.ListBuffer
import scala.annotation.tailrec

object QuestionOne {
  def fibonacciBuffer(n: Int) = {
    val buffer = ListBuffer[Int]()

    var a: Int = 1
    var b: Int = 1
    var c: Int = 1

    buffer += 1
    buffer += 1

    for (i <- 2 to n) {
      c = a + b
      a = b
      b = c

      buffer += c
    }

    buffer.toList
  }

  def fibonacciBuilder(n: Int) = {
    val builder = List.newBuilder[Int]

    var a: Int = 1
    var b: Int = 1
    var c: Int = 1

    builder += 1
    builder += 1

    for (i <- 2 to n) {
      c = a + b
      a = b
      b = c

      builder += c
    }

    builder.result
  }

  def fibonacciAddToList(lst: List[Int], countToAdd: Int) = {
    val buffer = lst.toBuffer

    @tailrec
    def fibonacciHelper(countToAdd: Int, prev1: Int, prev2: Int): Unit = {
      if (countToAdd > 0) {
        buffer += prev1 + prev2
        fibonacciHelper(countToAdd - 1, prev2, prev1 + prev2)
      }
    }

    val revLst = lst.reverse
    val prev1 = revLst.tail.head
    val prev2 = revLst.head

    fibonacciHelper(countToAdd, prev1, prev2)
    buffer.toList
  }

  def fibonacciAddToListImmutableVer(lst: List[Int], countToAdd: Int) = {
    @tailrec
    def fibonacciHelper(acc: List[Int], countToAdd: Int, prev1: Int, prev2: Int): List[Int] = {
      if (countToAdd == 0) acc
      else fibonacciHelper(acc :+ (prev1 + prev2), countToAdd - 1, prev2, prev1 + prev2)
    }

    lst.reverse match {
      case hd :: tl =>
        tl match {
          case hd2 :: tl2 => fibonacciHelper(lst, countToAdd, hd2, hd)
          case Nil => lst
        }
      case Nil => lst
    }
  }

  val fibonacciStream: Stream[Int] = 1 #:: 1 #:: fibonacciStream.zip(fibonacciStream.tail).map(n => n._1 + n._2)
}
