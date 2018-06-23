package chapter5

import org.scalatest._

import QuestionSeven._

class QuestionSevenSpec extends FlatSpec with Matchers {
  "The typesafeChallenge method" should "print out ..." in {
    typesafeChallenge()
    assert(true)
  }
}
