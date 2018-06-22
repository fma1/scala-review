package chapter5

object QuestionSix {
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = if (p(x)) f(x) else x
}
