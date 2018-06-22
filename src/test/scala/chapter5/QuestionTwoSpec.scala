package chapter5

import org.scalatest._

import scala.util.Random.nextInt

import QuestionTwo._

class QuestionTwoSpec extends FlatSpec with Matchers {
  "The invokeMax method" should "return max when given two numbers and max function" in {
    val num1 = nextInt()
    val num2 = nextInt()

    assert(invokeMax(num1, num2, scala.math.max) == scala.math.max(num1, num2))
  }

  "The invokeMin method" should "return min when given two numbers and min function" in {
    val num1 = nextInt()
    val num2 = nextInt()

    assert(invokeMin(num1, num2, scala.math.min) == scala.math.min(num1, num2))
  }

  "The invoke2nd method" should "return 2nd parameter and second function" in {
    val num1 = nextInt()
    val num2 = nextInt()

    val second: (Int, Int) => Int = (x, y) => y
    assert(invoke2nd(num1, num2, second) == num2)
  }

}
