package chapter9

import org.scalatest._

import QuestionOne._

class QuestionOneSpec extends FlatSpec with Matchers {
  "The Html Utils object" should "remove single elements" in {
    HtmlUtils.removeMarkup("<br/>") should equal("")
  }
  
  it should "remove paired elements" in {
    HtmlUtils.removeMarkup("<b>Hi</b>") should equal("Hi")
  }
  
  it should "have no effect on empty strings" in {
    val empty = true
    HtmlUtils.removeMarkup("").isEmpty should be(empty)
  }

  it should "remove paired nested elements" in {
    HtmlUtils.removeMarkup("<p><b>Hi</b></p>") should equal("Hi")
  }
}
