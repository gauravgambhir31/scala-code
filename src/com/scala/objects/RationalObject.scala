package com.scala.objects

import com.scala.classes.Rational


/**
  * Created by ggambhir on 12/30/16.
  */
object RationalObject {
  def main(args: Array[String]): Unit = {
    var r1 = new Rational(3,2)
    var r2 = new Rational(1,3)
    print("Sum :- ")
    println(r1 + r2)
    println(r1 + 2)
    println()
    print("Minus :- ")
    println(r1 - r2)
    println(r1 - 2)
    println()
    print("Multiply :- ")
    println(r1 * r2)
    println(r1 * 2)
    println()
    print("Divide :- ")
    println(r1 / r2)
    println(r1 / 2)
    println()

  }

}
