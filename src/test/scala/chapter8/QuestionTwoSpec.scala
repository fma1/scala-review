package chapter8

import org.scalatest._

import QuestionTwo._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The LinkedList class' foreach method" should "run a function on every element of the list" in {
    var sum: Int = 0
    val myFunc: Int => Unit = nextInt => { sum = sum + nextInt }
    val myLinkedList = MyLinkedList[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    myLinkedList.foreach(myFunc)
    assert(sum == 55)
  }

  // TODO: fix me
  //"The LinkedList class' map method" should "work" in {
  //  val myLinkedList = MyLinkedList[Int](1, 2, 3, 4, 5)
  //  val myLinkedList2 = MyLinkedList[Int](2, 3, 4, 5, 6)
  //  val func: Int => Int = x => x + 1

  //  assert(myLinkedList.map[Int](func).equals(myLinkedList2))
  //}
}
