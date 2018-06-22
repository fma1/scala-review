package chapter5

import org.scalatest._

import QuestionFour._

class QuestionFourSpec extends FlatSpec with Matchers {
  "The fzero method" should "return \"Hello World!\" when given \"Hello World!\"" in {
    assert(fzero[String]("Hello World!")(System.out.println) == "Hello World!")
  }
}
