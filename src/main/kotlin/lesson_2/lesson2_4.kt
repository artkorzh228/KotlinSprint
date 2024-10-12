package org.example.lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffPercentage: Int = 20
    val maxPercentage: Int = 100
    val crystalOreBuffing: Int = (crystalOre * buffPercentage) / maxPercentage
    val ironOreBuffing: Int = (ironOre * buffPercentage) / maxPercentage
    println("Crystal ores with buff: $crystalOreBuffing")
    println("Iron ores with buff: $ironOreBuffing")
}