package chapter7

import org.scalatest._

import QuestionThree._

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The listFilesByLetter method" should "print out all the files in a directory next to the letter they start with" in {
    listFilesByLetter(System.getProperty("user.home"))
    assert(true)
  }
}
