package com.skillbox.classes

open class Room(val a: Int, val b: Int) {
    var area = a * b
    protected open val title: String = "Обычная комната"
    fun getDescription() {
        println("$title, ${area}м2")
    }
}