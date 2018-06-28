package chapter6

import org.scalatest._

import QuestionThree._

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The firstRec method" should "return List(1, 2, 3) when given List(1, 2, 3, 4, 5, 6) and 3" in {
    assert(firstRec(List(1, 2, 3, 4, 5, 6), 3) == List(1, 2, 3))
  }

  "The firstForLoop method" should "return List(1, 2, 3) when given List(1, 2, 3, 4, 5, 6) and 3" in {
    assert(firstForLoop(List(1, 2, 3, 4, 5, 6), 3) == List(1, 2, 3))
  }
}
