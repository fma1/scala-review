package chapter5

import org.scalatest._

import QuestionSix._

class QuestionSixSpec extends FlatSpec with Matchers {
  "The conditional method" should "return \"Hello\" when given \"Hello\", a function and another function" in {
    val p: String => Boolean = str => str.isEmpty
    val f: String => String = str => str + " World"
    assert(conditional[String]("Hello", p, f) == "Hello")
  }
}
