package org.example.lesson_2

fun main() {
    val startHour: Int = 9
    val startMinute: Int = 37
    val hour: Int = 60
    val time: Int = 457
    val departureTime: Int = startHour * hour + startMinute
    val arrivalTime: Int = departureTime + time
    val arrivalHour: Int = arrivalTime / hour
    val arrivalMinute: Int = arrivalTime % hour
    println("The train will arrive at: $arrivalHour:$arrivalMinute")
}

