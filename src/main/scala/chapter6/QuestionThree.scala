package chapter6

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object QuestionThree {
  def firstRec[A](items: List[A], count: Int): List[A] = {
    @tailrec
    def firstRecHelper[A](rest: List[A], count: Int, acc: List[A]): List[A] = {
      if (count == 0) acc
      else rest match {
        case head :: tail => firstRecHelper(tail, count - 1, acc :+ head)
        case Nil => acc
      }
    }
    firstRecHelper[A](items, count, List[A]())
  }

  def firstForLoop[A](items: List[A], count: Int): List[A] = {
    val lstBuf: ListBuffer[A] = ListBuffer[A]()
    var curr: List[A] = items

    for (i <- 1 to count) {
      lstBuf += curr.head
      curr = curr.tail
    }

    lstBuf.toList
  }
}
