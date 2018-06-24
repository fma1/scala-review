package chapter6

import org.scalatest._

import QuestionOne._

object QuestionOneSpec {
  val firstTwentyOddLst = List(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39)
}

class QuestionOneSpec extends FlatSpec with Matchers {
  "The firstTwentyOddNumbers1 method" should "return a list of the first twenty odd numbers" in {
    assert(firstTwentyOddNumbers1() == QuestionOneSpec.firstTwentyOddLst)
  }

  "The firstTwentyOddNumbers2 method" should "return a list of the first twenty odd numbers" in {
    assert(firstTwentyOddNumbers2() == QuestionOneSpec.firstTwentyOddLst)
  }

  "The firstTwentyOddNumbers3 method" should "return a list of the first twenty odd numbers" in {
    assert(firstTwentyOddNumbers3() == QuestionOneSpec.firstTwentyOddLst)
  }
}
