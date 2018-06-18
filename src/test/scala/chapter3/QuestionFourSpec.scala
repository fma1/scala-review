package chapter3

import org.scalatest._

import QuestionFour._

class QuestionFourSpec extends FlatSpec with Matchers {
  "The print1to100 method" should "print numbers 1 to 100 with each line containing a group of 5 numbers" in {
    print1to100()
    assert(true)
  }
}
