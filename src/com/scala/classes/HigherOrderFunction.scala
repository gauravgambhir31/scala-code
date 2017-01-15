package com.scala.classes

/**
  * Created by ggambhir on 1/14/17.
  */
class HigherOrderFunction {

  def cube(n : Int) : Int = n * n * n

  def square(n : Int) : Int = n * n

  def number(n : Int) : Int = n

  def sum(num1 : Int, num2 : Int, result : Int , function : (Int => Int)) : Int = {
    if(num1 == num2) {
      result + function(num2)
    } else {
      sum (num1+1,num2,function(num1)+result,function)
    }

  }

}

object HigherOrderFunction extends App{
  val obj = new HigherOrderFunction
  val sq = (n : Int) => n * n
  println("Sum of number " + obj.sum(1,3,0,(n : Int)=>n))
  println("Sum of Square of number " + obj.sum(1,3,0,sq))
  println("Sum of Cube of number " + obj.sum(1,3,0,obj.cube))
}