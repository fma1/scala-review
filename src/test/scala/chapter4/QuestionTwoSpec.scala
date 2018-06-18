package chapter4

import org.scalatest._

import QuestionTwo._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The computeCircleAreaWithStr method" should "return 0.78 when given 0.5" in {
    assert(computeCircleAreaWithStr("0.5").toString.take(4) == "0.78")
  }

  "The computeCircleAreaWithStr method" should "return 0 when given empty string" in {
    assert(computeCircleAreaWithStr("") == 0)
  }
}
