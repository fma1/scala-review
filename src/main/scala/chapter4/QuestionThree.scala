package chapter4

import scala.annotation.tailrec

object QuestionThree {
  def getList5to50(): List[Int] = {
    def getList5to50Helper(acc: List[Int], currInt: Int): List[Int] = {
      if (currInt > 50) {
        acc
      } else {
        getList5to50Helper(currInt :: acc, currInt + 5)
      }
    }

    getList5to50Helper(List[Int](), 5).reverse
  }
}
