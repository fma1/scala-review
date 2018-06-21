package chapter4

import scala.math._

object QuestionFour {
  def millisecondsToDaysHoursMinutesSeconds(milliseconds: Long): (Int, Int, Int, Int) = {
    val days: Long = milliseconds / (1000*60*60*24)
    val hours: Long = (milliseconds - days*1000*60*60*24) / (1000*60*60)
    val minutes: Long = (milliseconds - days*1000*60*60*24 - hours*1000*60*60) / (1000*60)
    val seconds: Long = (milliseconds - days*1000*60*60*24 - hours*1000*60*60 - minutes*1000*60) / (1000)

    (days.toInt, hours.toInt, minutes.toInt, seconds.toInt)
  }
}
