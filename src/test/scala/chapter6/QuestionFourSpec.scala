package chapter6

import org.scalatest._

import QuestionFour._

class QuestionFourSpec extends FlatSpec with Matchers {
  "The getLongestStringFold method" should "return \"these\" when given List(\"Cut\", \"these\", \"words\", \"out\")" in {
    assert(getLongestStringFold(List("Cut", "these", "words", "out")) == "these")
  }

  "The getLongestStringReduce method" should "return \"these\" when given List(\"Cut\", \"these\", \"words\", \"out\")" in {
    assert(getLongestStringReduce(List("Cut", "these", "words", "out")) == "these")
  }
}
