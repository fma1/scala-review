package chapter5

import org.scalatest._

import QuestionFive._

class QuestionFiveSpec extends FlatSpec with Matchers {
  "The square method" should "return 25 when given 5" in {
    assert(square(5) == 25)
  }
}
