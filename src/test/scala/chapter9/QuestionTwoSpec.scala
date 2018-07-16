package chapter9

import org.scalatest._

import QuestionTwo.SafeStringUtils._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The trimToNone method" should "trim strings" in {
    trimToNone("   Hello   ") should equal(Some("Hello"))
  }

  it should "handle null/empty strings" in {
    trimToNone("") should equal(None)
    trimToNone(null) should equal(None)
  }

  "The stringToInteger method" should "convert strings to integers" in {
    stringToInteger("500") should equal(Some(500))
  }

  it should "return None when given an invalid input" in {
    stringToInteger("foobar") should equal(None)
  }

  "The stringToLong method" should "convert strings to integers" in {
    stringToLong("500") should equal(Some(500))
  }

  it should "return None when given an invalid input" in {
    stringToLong("foobar") should equal(None)
  }

  "The randomlyGenerateString" should "generate a unique string with only letters" in {
    val str = randomlyGenerateString(10)
    val pattern = """\W""".r
    pattern.findAllMatchIn(str).toList.isEmpty should equal(true)
  }
}
