package com.vozmediano.codelabs.lesson3.aquarium

import kotlin.math.PI


open class Aquarium(
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
    init {
        println("aquarium initializing")
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        // 1 l = 1000 cm^3
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }


}

class TowerTank(override var height: Int, var diameter: Int) :
    Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"

}






