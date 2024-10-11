package org.example.lesson_2
fun main(){
    val seniorEmployee: Int = 50
    val seniorSalary: Int = 30000
    val juniorEmployee: Int = 30
    val juniorSalary: Int = 20000
    val seniorSpend: Int = seniorEmployee * seniorSalary
    println("Full payment to old employees: $seniorSpend")
    val juniorSpend: Int = juniorEmployee * juniorSalary
    val totalSpend = seniorSpend + juniorSpend
    println("Full payment to all employees: $totalSpend")
    val spentForOneEmployee = totalSpend / (seniorEmployee + juniorEmployee)
    println("The average salary of 1 employee is: $spentForOneEmployee")
}
