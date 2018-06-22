package chapter5

object QuestionFour {
  def fzero[A](x: A)(f: A => Unit): A = { f(x); x }
}
