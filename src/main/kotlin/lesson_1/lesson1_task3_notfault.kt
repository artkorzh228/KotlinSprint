package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: String = "07"
    var timeOfTakeoff: Unit = println("$hour:$minute, $year")
    // println(timeOfTakeoff)

    hour = 10
    minute = "55"
    val timeOfLanding = println("$hour:$minute, $year")

}