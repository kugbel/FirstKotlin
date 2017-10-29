package be.kotlin.kotlincourse.basics

/**
 * Created by guyheylens on 10/04/17.
 */
fun main(args: Array<String>) {
    var myString = "test"

    if(myString != " "){
        println("Not empty")
    } else if(myString.startsWith("a")){
        println("string starts with an A")
    } else {
        println("Empty")
    }

    //if as an expression
    val result = if(myString != " "){
            true
            20 // cast to Any! => in c# Object
        } else {
            false
        }



    when(result){
        is String -> println("Excellent")
        is Int -> println("Number")
        "Value" -> println("Is a value")
    }

    var x = 2

    
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
    x = 1
    when (x) {
        0, 1 -> print("x == 0 or 1")
        else -> print("neither 0 nor 1")
    }

    val validNumbers = 1..19
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }



    println(result)
}