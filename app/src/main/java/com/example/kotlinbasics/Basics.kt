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
    print(resultDouble)


}