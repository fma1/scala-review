package chapter4

import scala.math._

object QuestionSix {
  def differenceBetweenPoints(point1: (Int, Int), point2: (Int, Int)): (Int, Int) = {
    (point2._1 - point1._1, point2._2 - point1._2)
  }
}
