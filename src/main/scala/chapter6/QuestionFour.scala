package chapter6

object QuestionFour {
  def getLongestStringFold(lst: List[String]): String = lst.tail.foldLeft(lst.head) { (prev, curr) => if (curr.length > prev.length) curr else prev }
  def getLongestStringReduce(lst: List[String]): String = lst.reduceLeft { (prev, curr) => if (curr.length > prev.length) curr else prev }
}
