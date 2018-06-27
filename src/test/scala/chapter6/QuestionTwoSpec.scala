package chapter6

import org.scalatest._

import QuestionTwo._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The factors method" should "return List(3, 5) when given 15" in {
    assert(factors(15) == List(3, 5))
  }

  "The factorsLst method" should "return List(3, 3, 5) when given List(9, 11, 13, 15)" in {
    assert(factorsLst(List(9, 11, 13, 15)) == List(3, 3, 5))
  }
}
