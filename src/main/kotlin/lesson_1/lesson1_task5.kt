package org.example.lesson_1

fun main() {

    val totalSeconds = 5409
    val secondsInMinute = 60
    val secondsInHour = secondsInMinute * secondsInMinute
    val hours = totalSeconds / secondsInHour
    val remainingSecondsInHour = totalSeconds % secondsInHour
    val minutes = remainingSecondsInHour / secondsInMinute
    val seconds = totalSeconds % minutes
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
  /*  // тут считаем остаток от деления если кол-во секунд не кратно 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    /*val minutes = remainingSecondsAfterHours / 60
    // считаем остаток от деления если кол-во оставшихся секунд не кратно 60
    val seconds = remainingSecondsAfterHours % 60


*/