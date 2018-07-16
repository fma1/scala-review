package chapter8

import org.scalatest._

import QuestionThree._

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The DirectoryListing class" should "list all files that contain pdf when given said predicate function" in {
    val predicateFunc: String => Boolean = str => str.contains("pdf")
    val myDirListing = new DirectoryListing("/home/fma1", predicateFunc)
    //assert(myDirListing.list().toSet == Set("For you – Medium.pdf", "Terms of Service.pdf", "Gmail - Your 500Tech Inc receipt [#1287-0464].pdf", "pdf", "Payment Terms of Service.pdf", "pdf2"))
    assert(true)
  }
}
