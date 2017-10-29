package be.kotlin.kotlincourse.functional

/**
 * Created by guyheylens on 17/04/17.
 */


//Extends the String class
//This package needs to be imported in the project you want to use the function.
fun String.hello(){
    println("It's me!")
}

fun String.toTitleCase(): String{
    //this refers to the instance of the String it is called upon.
    return this.split(" ").joinToString(" ") {it.capitalize() }
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun String.Hello() {
    println("hello, world!")
}


fun main(args: Array<String>) {
    println("Hello ".hello())

    val message = "this is a string to title case"
    println(message)
    println(message.toTitleCase())

    var cust = Customer()

    cust.makePrefered()
    cust.makePrefered("test")

    val str = "Batman"
    str.hello() // Prints out “hello, world!”
    "Robin".hello() // Same here

    println("Batman".capStuff()) // Prints out “BATMAN”
    println("Robin".prefixStuff("Hey").capStuff()) // Prints out “HEY ROBIN”

}

fun String.capStuff(): String {
    return this.toUpperCase()
}

fun String.prefixStuff(prefix: String): String {
    return "$prefix $this"
}

class Customer(){
    //This function has priority over extension functions with thesame name and definition
    fun makePrefered(){
        println("Customer makeprefered")
    }
}

fun Customer.makePrefered(){
    println("extended version")
}

fun Customer.makePrefered(message: String){
    println(message)
}