package com.scala.classes

/**
  * Created by ggambhir on 1/1/17.
  */
class MathmeticalOperations {

  def gcd(number1 : Int, number2 : Int) : Int = if(number1 % number2 == 0) number2 else gcd(number2, number1 % number2)

  private def printTable(number : Int) = for(i <- 1 to 10) print(number * i + " ") ; println()

  def format(i: Int) : String = if (i.toString.length == 1) i + "   " else if  (i.toString.length == 2) i + "  " else i + " "

  def table(number : Int, mulFactor : Int) : Unit = {

    if(mulFactor > 10)
      println("Table printed")
    else {
      for (i <- 2 to number) print( format(i * mulFactor))
      println()
      table(number,mulFactor+1)
    }
    }

}
