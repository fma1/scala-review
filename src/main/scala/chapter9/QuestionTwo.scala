package chapter9

import scala.util.{ Try, Success, Failure, Random }
import scala.collection.mutable.StringBuilder

object QuestionTwo {
  object SafeStringUtils {
    private val r = Random

    // Returns a trimmed version of the string wrapped in an Option,
    // or None if the trimmed string is empty.
    def trimToNone(s: String): Option[String] = {
      Option(s) map(_.trim) filterNot(_.isEmpty)
    }

    def stringToInteger(s: String): Option[Int] = {
      Try(s.toInt) match {
        case Success(number) => Some(number)
        case Failure(_) => None
      }
    }

    def stringToLong(s: String): Option[Long] = {
      Try(s.toLong) match {
        case Success(number) => Some(number)
        case Failure(_) => None
      }
    }

    def randomlyGenerateString(n: Int): String = {
      val array = new Array[Char](n)
      array.map(_ => if (r.nextInt(1) == 0) (r.nextInt(25) + 65).toChar else (r.nextInt(25) + 97).toChar).foldLeft(new StringBuilder())((prev, curr) => prev + curr).toString
    }
  }
}
