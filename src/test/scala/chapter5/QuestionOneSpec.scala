package chapter5

import org.scalatest._

import QuestionOne._

class QuestionOneSpec extends FlatSpec with Matchers {
  "The maxOfTwoInts method" should "return 7 when given 5 and 7" in {
    assert(maxOfTwoInts(5, 7) == 7)
  }

  "The maxOfThreeTuple method" should "return 10 when given (4, 6, 10) and maxOfTwoInts" in {
    assert(maxOfThreeTuple((4, 6, 10), maxOfTwoInts) == 10)
  }
}
