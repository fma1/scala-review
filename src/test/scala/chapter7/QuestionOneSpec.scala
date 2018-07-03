package chapter7

import org.scalatest._

import QuestionOne._

class QuestionOneSpec extends FlatSpec with Matchers {
  "The fibonacciBuffer method" should "return List(1, 1, 2, 3, 5, 8, 13) when given 6" in {
    assert(fibonacciBuffer(6) == List(1, 1, 2, 3, 5, 8, 13))
  }

  "The fibonacciBuilder method" should "return List(1, 1, 2, 3, 5, 8, 13) when given 6" in {
    assert(fibonacciBuilder(6) == List(1, 1, 2, 3, 5, 8, 13))
  }

  "The fibonacciAddToList method" should "return List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55) when given List of first 6 fibonacci numbers and 3" in {
    assert(fibonacciAddToList(List(1, 1, 2, 3, 5, 8, 13), 3) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55))
  }

  "The fibonacciAddToListImmutableVer method" should "return List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55) when given List of first 6 fibonacci numbers and 3" in {
    assert(fibonacciAddToListImmutableVer(List(1, 1, 2, 3, 5, 8, 13), 3) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55))
  }

  "The fibonacciStream" should "print out the first 6 fibonacci numbers when we take 7" in {
    assert(fibonacciStream.take(7).toList == List(1, 1, 2, 3, 5, 8, 13))
  }

  "The fibNext method" should "return Some(13) when given 8" in {
    assert(fibNext(8) == Some(13))
  }

  "The fibNext method" should "return None when given 9" in {
    assert(fibNext(9) == None)
  }
}
