package com.example.kotlinbasics

fun main(){

    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple")
    //print(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")
    //print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //print(daysOfTheWeek[2])
    for(key in daysOfTheWeek.keys){
        //print("$key is to ${daysOfTheWeek[key]} ")
    }

    val fruitsMap = mapOf("Favorite" to Fruits("Grape", 2.5)
        , "OK" to Fruits("Apple", 1.0))

    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    print(newDayOfWeek.toSortedMap())
}

data class Fruits(val name: String, val price: Double)