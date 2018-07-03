package chapter7

object QuestionTwo {
  def listFiles(dir: String): Unit = {
    try {
      val files = new java.io.File(dir).listFiles.toList.map(_.toString).filterNot(file => file.substring(dir.length + 1).charAt(0) == '.')
      files.foreach { file => print(s"$file ; ") }
    } catch {
      case e: Exception => println(s"Error occured: $e")
    }
  }
}
