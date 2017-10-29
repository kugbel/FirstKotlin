package be.kotlin.kotlincourse.functions

/**
 * Created by guyheylens on 12/04/17.
 */

fun main(args: Array<String>) {
    hello()

    val value = returnsAFour()
    takingAString("Some value")
    sumDefault(1,2)

    //Named parameters
    printDetails("Guy", phone = "555 14 25 36")
    //Order the named parameters
    printDetails(phone = "555 14 25 36", name = "Guy" )



    //multiple number of strings
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")

}

//Unit similar to void
//fun hello():Unit{
fun hello(){
    println("Hello")
}

fun max(a: Int, b: Int)= if (a > b) a else b

fun throwingExceptions(): Nothing{
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int{
    return 4
}

fun takingAString(name: String){
    println(name)
}

//Single expression function
fun sum(x:Int, y:Int) =  x + y

//Default parameter
fun sumDefault(x: Int, y:Int, z: Int = 4) = x + y + z

fun printDetails(name:String, email:String = "", phone:String){
    println("name: $name - email: $email - phone: $phone")
}

//Undefined number of parameters
fun printStrings(vararg strings: String ){
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (mystring in strings) {
        println(mystring)
    }
}




