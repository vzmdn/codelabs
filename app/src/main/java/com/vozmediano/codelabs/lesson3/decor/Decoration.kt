package com.vozmediano.codelabs.lesson3.decor



class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}

fun main() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}


data class Decoration(val rocks: String) {
}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}


fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, _, diver) = d5
    println(rock)

    println(diver)


}







