package chapter6

object QuestionTwo {
  def factors(num: Long): List[Long] = {
    val sqrt = scala.math.sqrt(num)

    @scala.annotation.tailrec
    def factorsHelper(i: Long, acc: List[Long]): List[Long] = {
      if (i > sqrt) acc
      else if (num % i == 0) {
        if (i != num / i) factorsHelper(i + 1, i :: num / i :: acc) 
        else factorsHelper(i + 1, i :: acc) 
      }
      else factorsHelper(i + 1, acc)
    }

    factorsHelper(2, List[Long]())
  }

  def factorsLst(nums: List[Long]): List[Long] = nums.flatMap(num => factors(num))
}
