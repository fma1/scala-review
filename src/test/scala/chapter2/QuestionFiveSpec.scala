package chapter2

import org.scalatest._

import QuestionFive.convertFour

class QuestionFiveSpec extends FlatSpec with Matchers {
  "The convertFour method" should "return 128" in {
    assert(convertFour() == 128)
  }
}
