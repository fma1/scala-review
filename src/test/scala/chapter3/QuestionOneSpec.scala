package chapter3

import org.scalatest._

import QuestionOne.stringMatch

class QuestionOneSpec extends FlatSpec with Matchers {
  "The stringMatch" should "return n/a when given empty string" in {
    assert(stringMatch("") == "n/a")
  }

  it should "return hello when given hello" in {
    assert(stringMatch("hello") == "hello")
  }
}
