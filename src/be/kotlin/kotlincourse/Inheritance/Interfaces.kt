package be.kotlin.kotlincourse.Inheritance

/**
 * Created by guyheylens on 1/05/17.
 */


interface Interface1 {
    fun funA(){
        println("Interface 1 says Hello")
    }
}

interface Interface2 {
    fun funA(){
        println("Interface 2 says Hello")
    }
}

class Class1and2: Interface1, Interface2{
    override fun funA() {
        //refer with the super keyword
        super<Interface2>.funA()
        super<Interface1>.funA()
    }
}


fun main(args: Array<String>) {
    val c =Class1and2()
    c.funA() //which interface was called?
}