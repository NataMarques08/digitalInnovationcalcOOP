package display.calc.digital.one

import calculatorOOP.functionCalc

fun main(){

    val arithmetic = functionCalc()
    println("Welcome to Digital Innovation One Calculator")
    println("---------------------------------------------")
    print("Please enter the first value: ")
    val a:Float = readLine()!!.toFloat()
    print("Now, enter the second value: ")
    val b:Float = readLine()!!.toFloat()
    println()
    print("Great!What arithmetic operation do you want to perform?[+,-,*,/]")
    val operation:String = readLine().toString()
    println()
   when(operation){
       "+" -> println("The sum between $a and $b is: "+arithmetic.soma(a,b))
       "-" -> println("The subtraction between $a and $b is: "+arithmetic.menos(a,b))
       "*" -> println("The multiplication between $a and $b is: "+arithmetic.mult(a,b))
       "/" -> println("The division between $a and $b is: "+arithmetic.div(a,b))
       else -> println("Valor invalido")
   }

}