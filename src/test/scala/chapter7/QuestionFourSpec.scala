package chapter7

import org.scalatest._

import QuestionFour._

class QuestionFourSpec extends FlatSpec with Matchers {
  "The productTwoNumbers method" should "return 30 when given 5 and 6" in {
    assert(productTwoNumbers("5", "6") == Some(30))
  }

  "The productTwoNumbers method" should "return None when given foo and bar" in {
    assert(productTwoNumbers("foo", "bar") == None)
  }
}
