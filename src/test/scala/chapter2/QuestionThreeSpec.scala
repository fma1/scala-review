package chapter2

import org.scalatest._

import QuestionThree.generateString

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The generateString method" should "return You owe me $2.73" in {
    assert(generateString() == "You owe me $2.73")
  }
}
