package com.example.kotlinbasics

fun main(){
    val arrayList: ArrayList<Int> = ArrayList()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList.add(5)
    var res = arrayList.sum()/arrayList.size
    println(res)
    var res2 = 0
    for(i in arrayList){
        res2 += i
    }
    println(res2/arrayList.size)
}