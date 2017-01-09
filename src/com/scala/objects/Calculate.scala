package com.scala.objects

import com.scala.classes.MathmeticalOperations
/**
  * Created by ggambhir on 1/1/17.
  */
object Calculate {

  def main(args: Array[String]): Unit = {
    var mo = new MathmeticalOperations
    println("GCD :- " + mo.gcd(20,39))
    mo.table(10,1)
  }
}
