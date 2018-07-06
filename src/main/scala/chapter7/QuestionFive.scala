package chapter7

import scala.collection.immutable.Map

import scala.util.{ Try, Success, Failure }
object QuestionFive {
  def safeGetProperty(property: String): String = {
    Try(Option(System.getProperty(property))) match {
      case Success(strOpt) =>
        strOpt match {
          case Some(str) => str
          case None => ""
        }
      case Failure(_) => ""
    }
  }
}
