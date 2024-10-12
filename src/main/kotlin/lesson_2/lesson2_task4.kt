package org.example.lesson_2

fun main(){
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffPercentage: Int = 20
    val buffedCrystalOre: Int = (crystalOre * buffPercentage) / 100
    val buffedIronOre: Int = (ironOre * buffPercentage) / 100
    println("Crystal ores after buff: $buffedCrystalOre")
    println("Iron ores after buffing: $buffedIronOre")
}