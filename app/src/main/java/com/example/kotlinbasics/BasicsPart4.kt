package com.example.kotlinbasics

fun main(){
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    //print(anyTypes.size)
    //print(month[1])
    val additionalMonth = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonth.addAll(newMonths)
    additionalMonth.add("July")
    //print(additionalMonth)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    //days.removeAt(3)
    val removeList = mutableListOf<String>("Mon", "Wed")
    ///days.removeAll(removeList)
    days.removeAll(days)
    print(days)
}