package chapter5

import QuestionSix.conditional

object QuestionSeven {
  def typesafeChallenge(): Unit = {
    val threeTest: Int => Boolean = x => x % 3 == 0
    val fiveTest: Int => Boolean = x => x % 5 == 0
    val threeIdentity: Int => Int = x => { print("type"); -1 }
    val fiveIdentity: Int => Int = x => { print("safe"); -1 }

    for (num <- 1 to 100) {
      val threeRes = conditional[Int](num, threeTest, threeIdentity)
      val fiveRes = conditional[Int](num, fiveTest, fiveIdentity)

      if (fiveRes != -1 && threeRes != -1) {
        print(fiveRes)
      }
      println()
    }
  }
}
