package chapter4

import scala.math._

object QuestionSeven {
  def returnIntFirstPos(tuple: (Any, Any)): Int = {
    tuple match {
      case (v1, v2) =>
        if (v1.isInstanceOf[Int]) v1.asInstanceOf[Int]
        else 0
    }
  }
}
