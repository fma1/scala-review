package chapter5

object QuestionTwo {
  def invokeMax(x: Int, y: Int, max: (Int, Int) => Int) = {
    max(x, y)
  }

  def invokeMin(x: Int, y: Int, min: (Int, Int) => Int) = {
    min(x, y)
  }

  def invoke2nd(x: Int, y: Int, second: (Int, Int) => Int) = {
    second(x, y)
  }
}
