package com.example.kotlinbasics

fun main(){
    // Argument
    var avg = average(5.3, 13.13)
    print("result is $avg")
}
// Method - a Method is a Function within a class

// Parameter (input)
fun addUp(a: Int, b: Int ) : Int {
    //output
    return a+b
}

fun average(a: Double, b: Double) : Double {
    return (a+b)/2
}

fun myFunction() {
    print("Called from myFunction")
}