package com.example.kotlinbasics

fun main(){
    // Argument
    var avg = average(5.3, 13.13)
    /*print("result is $avg")

     */

    // Nullables

    // name = null -> Compilation Error
    var nullableName : String? = "Alexander"
    //nullableName = null

    var len2 = nullableName?.length
    //nullableName?.let { println(it.length) }
    /*
    if(nullableName != null) {
        var len2 = nullableName.length
    }else{
        null
    }

     */

    // ?: Elvis Operator, Not Null Assertion
    val name = nullableName ?: "Guest"
    println("name is $name")

    println(nullableName!!.toLowerCase())





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