package chapter4

import org.scalatest._

import QuestionOne._

class QuestionOneSpec extends FlatSpec with Matchers {
  "The computeCircleArea method" should "return 0.78 when given 0.5" in {
    assert(computeCircleArea(0.5).toString.take(4) == "0.78")
  }
}
