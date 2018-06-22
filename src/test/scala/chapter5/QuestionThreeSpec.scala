package chapter5

import org.scalatest._

import QuestionThree._

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The higherOrderFunc method" should "return a function when given an integer" in {
    assert(higherOrderFunc(5).isInstanceOf[Function[Int, Int]])
  }

  "The higherOrderFunc method" should "return 50 when given 5 and then given 10" in {
    assert(higherOrderFunc(5)(10) == 50)
  }
}
