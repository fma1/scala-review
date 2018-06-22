package chapter4

import org.scalatest._

import QuestionSeven._

class QuestionSevenSpec extends FlatSpec with Matchers {
  "The returnIntFirstPos method" should "return 4 when given (4, 5)" in {
    assert(returnIntFirstPos((4, 5)) == 4)
  }

  it should "return 0 when given (\"Hello\", \"World\")" in {
    assert(returnIntFirstPos(("Hello", "World")) == 0)
  }
}
