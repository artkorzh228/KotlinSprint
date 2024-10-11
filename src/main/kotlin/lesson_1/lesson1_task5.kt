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




