package chapter3

import org.scalatest._

import QuestionTwo._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The testDoubleIf method" should "return greater when given number greater than 0" in {
    assert(testDoubleIf(10) == "greater")
  }

  "The testDoubleIf method" should "return same when given number equal than 0" in {
    assert(testDoubleIf(0) == "same")
  }

  "The testDoubleIf method" should "return less when given number less than 0" in {
    assert(testDoubleIf(-10) == "less")
  }

  "The testDoubleMatch method" should "return greater when given number greater than 0" in {
    assert(testDoubleMatch(10) == "greater")
  }

  "The testDoubleMatch method" should "return same when given number equal than 0" in {
    assert(testDoubleMatch(0) == "same")
  }

  "The testDoubleMatch method" should "return less when given number less than 0" in {
    assert(testDoubleMatch(-10) == "less")
  }
}
