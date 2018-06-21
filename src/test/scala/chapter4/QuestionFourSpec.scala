package chapter4

import org.scalatest._

import QuestionFour._

class QuestionFourSpec extends FlatSpec with Matchers {
  "The millisecondsToDaysHoursMinutesSeconds method" should "return (1, 3, 46, 40) when given 100000000L" in {
    assert(millisecondsToDaysHoursMinutesSeconds(100000000L) == (1, 3, 46, 40))
  }
}
