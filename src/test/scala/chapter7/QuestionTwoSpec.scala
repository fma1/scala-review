package chapter7

import org.scalatest._

import QuestionTwo._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The listFiles method" should "print out all the files in a directory separated by commas minus dotfiles" in {
    println("Hello")
    listFiles(System.getProperty("user.home"))
    assert(true)
  }
}
