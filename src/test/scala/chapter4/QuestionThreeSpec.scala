package chapter4

import org.scalatest._

import QuestionThree._

class QuestionThreeSpec extends FlatSpec with Matchers {
  "The getList5to50 method" should "return a list of integers from 5 to 50 with only those numbers divisible by 5" in {
    val resultLst = getList5to50()
    val expectedLst = List[Int](5, 10, 15, 20, 25, 30, 35, 40, 45, 50)
    println(resultLst)
    assert(resultLst == expectedLst)
  }
}
