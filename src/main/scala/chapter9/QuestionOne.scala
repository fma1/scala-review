package chapter9

object QuestionOne {
  object HtmlUtils {
    def removeMarkup(input: String) = {
      input
        .replaceAll("""</?\w[^>]*>""", "")
        .replaceAll("<.*", "")
    }
  }
}
