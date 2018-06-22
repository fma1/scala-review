package chapter4

import org.scalatest._

import QuestionEight._

class QuestionEightSpec extends FlatSpec with Matchers {
  "The ThreeTupleToSixTuple method" should "return (true, \"true\", 22.5, \"22.5\", \"yes\", \"yes\") when given (true, 22.5, \"yes\")" in {
    assert(ThreeTupleToSixTuple(true, 22.5, "yes") == (true, "true", 22.5, "22.5", "yes", "yes"))
  }
}
