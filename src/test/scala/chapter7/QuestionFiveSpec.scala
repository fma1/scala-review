package chapter7

import org.scalatest._

import QuestionFive._

class QuestionFiveSpec extends FlatSpec with Matchers {
  "The safeGetProperty method" should "return user's home when given user.home" in {
    assert(safeGetProperty("user.home") == System.getProperty("user.home"))
  }

  "The safeGetProperty method" should "return empty string when given foo" in {
    assert(safeGetProperty("foo") == "")
  }

  "The safeGetProperty method" should "return empty string when given empty string" in {
    assert(safeGetProperty("") == "")
  }
}
