package chapter4

import scala.math._

object QuestionEight {
  def ThreeTupleToSixTuple(tuple: (Any, Any, Any)): (Any, String, Any, String, Any, String) = {
    tuple match {
      case (v1, v2, v3) =>
        (v1, v1.toString, v2, v2.toString, v3, v3.toString)
    }
  }
}
