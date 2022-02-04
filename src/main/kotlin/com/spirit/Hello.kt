package com.spirit

fun main() {
//    println("Hello Kotlin")
    val p = Human()
    p.hello()

}
class Human() {
    lateinit var name : String
    fun hello() {
        println("Hello Kotlin")
    }
}