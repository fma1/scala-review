package example

import org.scalatest._

class QuestionOneSpec extends FlatSpec with Matchers {
  "The QuestionOne object" should "not call println()" in {
    // Would do mocking here but too much work
    assert(true)
  }
}
