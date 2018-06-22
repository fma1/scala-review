package chapter5

object QuestionOne {
  def maxOfTwoInts(x: Int, y: Int): Int = if (x > y) x else y

  def maxOfThreeTuple(tuple: (Int, Int, Int), func: (Int, Int) => Int): Int = {
    tuple match {
      case (v1, v2, v3) =>
        func(func(v1, v2), v3)
    }
  }
}
