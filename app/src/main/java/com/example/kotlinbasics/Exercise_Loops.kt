package com.example.kotlinbasics

fun main() {
    var x = 0
    while (x <= 10000){
        println("$x ")
        x++
        if (x == 9002) {
            println("IT'S OVER 9000!!!")
        }
    }

    for(num in 1..10000) {
        if(num == 9001) {
            println("IT'S OVER 9000!!!")
        }
    }

    var humidityStatus = "humid"
    var humidityLevel = 80
    while (humidityStatus == "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel <= 60) {
            humidityStatus = "comfy"
            print("it's comfy now")
        }
    }
}
