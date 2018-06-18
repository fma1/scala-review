package chapter3

import org.scalatest._

import QuestionThree._

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The colorMatch method" should "return 00FFFF when given cyan" in {
    assert(colorMatch("cyan") == "00FFFF")
  }

  "The colorMatch method" should "return FF00FF when given magenta" in {
    assert(colorMatch("magenta") == "FF00FF")
  }

  "The colorMatch method" should "return FFFF00 when given yellow" in {
    assert(colorMatch("yellow") == "FFFF00")
  }

  "The colorMatch method" should "return 000000 when given anything else" in {
    assert(colorMatch("blahblah") == "000000")
  }
}
