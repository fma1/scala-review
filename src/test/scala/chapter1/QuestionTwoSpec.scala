package chapter1

import org.scalatest._

import QuestionTwo.cToF

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The cToF method" should "return 50 when given 10" in {
    assert(cToF(10) == 50)
  }

  it should "return 86 when given 30" in {
    assert(cToF(30) == 86)
  }
}
