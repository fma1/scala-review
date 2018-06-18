package chapter4

import scala.math._

object QuestionTwo {
  def computeCircleAreaWithStr(radius: String): Double = {
    try {
      Pi * radius.toDouble * radius.toDouble
    } catch {
      case e: Exception => 0d
    }
  }
}
