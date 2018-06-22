package chapter4

import org.scalatest._

import QuestionSix._

class QuestionSixSpec extends FlatSpec with Matchers {
  "The differenceBetweenPoints method" should "return (4, 5) when given (1, 1) and (5, 6)" in {
    assert(differenceBetweenPoints((1, 1), (5, 6)) == (4, 5))
  }
}
