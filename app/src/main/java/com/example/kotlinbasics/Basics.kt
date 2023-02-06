package com.example.kotlinbasics

fun main() {


    /*
    This
    is a multiline
    comment
     */

    // type string
    // immutable variable
    val myName = "Alexander"

    // type integer
    // type inference finds out the type from context
    val myAge = 20

    /* Integer Types: Byte (8bit), Short (16bit),
    Int (32bit), Long (64bit)
     */
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_11_22_33_44_222_333_444

    // Floating Point number Types: Float (32bit), Double (64bit)
    val myFloat: Float = 11.22F
    val myDouble: Double = 1.223344556677

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //print("First Character $firstCharInStr ")
    //print("Last Character $lastCharInStr ")

    //print("Hello $myName ")

    //print("First character is $firstCharInStr and the lengh of myStr is ${myStr.length}")

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble : Double = a / b
    //print(resultDouble)

    //Comparison operators (==, !=, <, >, <=, =>)
    val isEqual = 5==3
    //String interpolation
    //println("isEqual is $isEqual")

    val isNotEqual = 5!=5

    //println("isNotEqual is $isNotEqual")

    //println("is-5less3 ${-5>3}")
    //println("is5LowerEqual3 ${5<=3}")
    //println("is5GreaterEqual3 ${5>=3}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    //println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    //println("myNum is $myNum")
    //Increments after use
    //println("myNum is ${myNum++}")
    //Increments before use
    //println("myNum is ${++myNum}")
    //println("myNum is ${--myNum}")

    //If statements
    /*
    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2){
        println("use raw farce")
    }else if (heightPerson1 == heightPerson2){
        println("use your power technique 1337")
    }else{
        println("use technique")
    }
    */

    /*
    val age = 21
    if (age >= 21){
        println("You may drink in the US")
    }else if (age >= 18){
        println("You may vote")
    }else if(age >= 16){
        println("You may drive")
    }else{
        println("You are too young")
    }
    */

    /*
    var name = "Alexander"

    if(name == "Alexander"){
        println("welcome home Alexander")
    }else{
        println("Who are you?")
    }

    val isRainy = true

    if(isRainy){
        println("It's rainy")
    }
     */

    /*
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

     */

    /*
    var month = 3

    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> print("Fall")
        12, 1, 2 -> print("Winter")
        else -> println("Invalid Season")
    }

     */

    /*
    val age = 21
    when(age){
        !in 0..20 -> println("You may drink in US")
        in 18..20 -> println("You may vote")
        16, 17 -> println("You may drive")
        else -> println("You are too young")
    }

     */

    /*
    var x: Any = "13.37f"
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

     */

    //While loop executes a block of code repeatedly as long as a given condition is true
    /*
    var x = 1
    while (x <= 10) {
        print("$x ")
        x++
    }
    println("\nwhile loop is done")

     */
    /*
    var y = 100
    while (y >= 0) {
        print("$y ")
        y -= 2
    }

     */
    /*
    x = 1
    do {
        print("\n$x ")
        x++
    }while (x <= 10)
    println("\ndo while loop is done")

     */
    /*
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

     */
    /*
    for (num in 1..10){
        print("$num ")
    }
    println("\n")
    for(i in 1 until 10){
        print("$i ")
    }
    println("\n")
    for(j in 10 downTo 1 step 2){
        print("$j ")
    }

     */

    //Break and Continue
    for(i in 1..20){
        // 10/2 = 5
            // 11/2 = 5.5 which is 5 in term of an int
        if (i/2 == 5){
            continue
        }
        print("$i ")
    }
}