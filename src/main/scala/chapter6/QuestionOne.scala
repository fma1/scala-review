package chapter6

object QuestionOne {
  def firstTwentyOddNumbers1(): List[Int] = {
    val indexedSeq = for (i <- 1 to 40 if i % 2 != 0) yield i
    indexedSeq.toList
  }

  def firstTwentyOddNumbers2(): List[Int] = {
    (1 to 40).filter(elem => elem % 2 != 0).toList
  }

  def firstTwentyOddNumbers3(): List[Int] = {
    (0 to 39).filter(elem => elem % 2 == 0).map(elem => elem + 1).toList
  }
}
