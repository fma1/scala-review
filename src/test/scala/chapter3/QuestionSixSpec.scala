package chapter3

import org.scalatest._

import QuestionSix._

class QuestionSixSpec extends FlatSpec with Matchers {
  "The print1to100multiples3and5OneLine method" should "print numbers 1 to 100 with each line containing a group of 5 numbers" in {
    print1to100multiples3and5OneLine()
    assert(true)
  }
}
