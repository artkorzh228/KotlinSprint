package org.example.lesson2
import kotlin.math.pow

fun main() {
    val startMoney: Int = 70000
    val rate: Double = 0.167
    val years: Int = 20

    val endMoney = startMoney * (1 + rate).pow(years)
    println("Deposit amount after 20 years: %.3f".format(endMoney))
}
