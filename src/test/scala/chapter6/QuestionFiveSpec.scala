package chapter6

import org.scalatest._

import QuestionFive._

class QuestionFiveSpec extends FlatSpec with Matchers {
  "The revereList method" should "return List(15, 13, 11, 9) when given List(9, 11, 13, 15)" in {
    assert(reverseList(List[Int](9, 11, 13, 15)) == List[Int](15, 13, 11, 9))
  }
}
