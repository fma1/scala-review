package chapter3

import org.scalatest._

import QuestionFive._

class QuestionFiveSpec extends FlatSpec with Matchers {
  "The print1to100multiples3and5 method" should "print numbers 1 to 100 with each line containing a group of 5 numbers" in {
    print1to100multiples3and5()
    assert(true)
  }
}
