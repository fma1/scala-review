package chapter2

import org.scalatest._

import QuestionSix._

class QuestionSixSpec extends FlatSpec with Matchers {
  "The telephoneValue method" should "return 9255551943" in {
    assert(telephoneValue() == 9255551943L)
  }

  "The telephoneValue2 method" should "return (925, 555, 1943)" in {
    assert(telephoneValue2() == (925, 555, 1943))
  }
}
