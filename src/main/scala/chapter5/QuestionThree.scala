package chapter5

object QuestionThree {
  def higherOrderFunc(num: Int) = {
    (x: Int) => { num * x }
  }
}
