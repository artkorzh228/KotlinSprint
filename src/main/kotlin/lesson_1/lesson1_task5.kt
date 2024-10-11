package org.example.lesson_1

fun main() {
    // вводим полное кол-во секунд
    val totalSeconds = 5409
    val hours = totalSeconds / 3600
    // тут считаем остаток от деления если кол-во секунд не кратно 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    // считаем остаток от деления если кол-во оставшихся секунд не кратно 60
    val seconds = remainingSecondsAfterHours % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}