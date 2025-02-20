package com.vozmediano.codelabs.lesson3.lists

fun main() {
    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")

    println(numbers.toString())
    println(numbers.toList().reversed().subList(0,1).contains(42))

    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
    println(list2.lastIndex)
    println(list2.sumOf { it.length })

    for (s in list2.listIterator()) {
        println("$s ")
    }



}