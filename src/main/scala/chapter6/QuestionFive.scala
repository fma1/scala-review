package chapter6

import scala.annotation.tailrec

object QuestionFive {
  def reverseList[A](lst: List[A]) = {
    @tailrec
    def reverseListHelper(acc: List[A], rest: List[A]): List[A] = {
      rest match {
        case hd :: tl => reverseListHelper(hd :: acc, tl)
        case Nil => acc
      }
    }
    reverseListHelper(List[A](), lst)
  }
}
