package org.example.lesson_2

fun main() {
    var startHour: Int = 9
    var startMinute: Int = 37

    var hour: Int = 60
    var time: Int = 457
    while (time > hour) {
        time -= hour
        startHour++
    }
    if (time < hour)
    {
        time += startMinute
        startHour++
        startMinute = time - hour
    }

    println("$startHour:$startMinute")
}
