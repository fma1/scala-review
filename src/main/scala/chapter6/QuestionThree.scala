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
    // Edge case
    if (items.length < count) items
    else {
      val lstBuf: ListBuffer[A] = ListBuffer[A]()
      var curr: List[A] = items

      for (i <- 1 to count) {
        lstBuf += curr.head
        curr = curr.tail
      }

      lstBuf.toList
    }
  }

  def firstFoldLeft[A](items: List[A], count: Int): List[A] = {
    if (items.length < count) items
    else {
      var innerCount = 0
      val foldFunc: (List[A], A) => List[A] =
        (acc, next) => {
          val result: List[A] = if (innerCount >= count) acc else acc :+ next
          innerCount = innerCount + 1
          result
        }

      items.foldLeft(List[A]())(foldFunc)
    }
  }
}
