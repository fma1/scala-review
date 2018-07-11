package chapter8

import java.io.{File, FilenameFilter}

object QuestionThree {
  class DirectoryListing(fullPath: String, predicateFunc: String => Boolean) {
    private lazy val filenameFilter = new FilenameFilter() {
      override def accept(dir: File, name: String): Boolean = predicateFunc(name)
    }
    private lazy val currentList: List[String] = (new File(fullPath)).listFiles(filenameFilter).map(file => file.getName()).toList

    def list(): List[String] = currentList
  }
}
