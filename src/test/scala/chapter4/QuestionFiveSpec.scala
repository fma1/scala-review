package chapter4

import org.scalatest._

import QuestionFive._

class QuestionFiveSpec extends FlatSpec with Matchers {
  "The raisedToPower method" should "return 8 when given 2 and 3" in {
    assert(raisedToPower(2, 3) === 8)
  }

  "The raisedToPower2 method" should "return 8 when given 2 and 3" in {
    assert(raisedToPower(2, 3) === 8)
  }
}
