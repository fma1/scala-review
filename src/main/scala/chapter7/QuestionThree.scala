package chapter7

import scala.collection.immutable.Map

object QuestionThree {
  def listFilesByLetter(dir: String): Unit = {
    try {
      val files = new java.io.File(dir).listFiles.toList.map(_.toString.substring(dir.length + 1)).filterNot(file => file.charAt(0) == '.')
      val foldFunc: (Map[Char, List[String]], (Char, String)) => Map[Char, List[String]] =
        (acc, next) => {
          next match {
            case (char, file) =>
              acc.get(char) match {
                case Some(fileLst) => acc + (char -> (fileLst :+ file))
                case None => acc + (char -> List[String](file))
              }
          }
        }
      val map = files.map(file => (file.charAt(0), file)).foldLeft(Map[Char, List[String]]())(foldFunc)
      println(map.toString())
    } catch {
      case e: Exception => println(s"Error occured: $e")
    }
  }
}
