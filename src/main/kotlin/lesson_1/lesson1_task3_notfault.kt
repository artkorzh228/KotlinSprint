package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: String = "07"
    var timeOfTakeoff: String = println("Takeoff time: $hour:$minute, $year").toString()
    // println(timeOfTakeoff)

    hour = 10
    minute = "55"
    val timeOfLanding = println("Landing time: $hour:$minute, $year")

}