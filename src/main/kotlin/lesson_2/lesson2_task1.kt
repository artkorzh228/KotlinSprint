package org.example.lesson_2

fun main() {
    val grades: DoubleArray = doubleArrayOf(3.0, 4.0, 3.0, 5.0)
    val sum = grades.sum()
    val amountOfStudents = grades.size
    val arithmeticMean : Double = sum / amountOfStudents
    println("The sum of students is $sum students are: $amountOfStudents, arithmetic mean is $arithmeticMean")

}