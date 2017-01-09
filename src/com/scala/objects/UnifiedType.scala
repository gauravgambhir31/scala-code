package com.scala.objects

/**
  * Created by ggambhir on 1/3/17.
  */



object UnifiedType extends App {
  def printIt(s: String) = print(s)

  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a string" // add a string
  set += 732 // add a number
  set += 'c' // add a character
  set += true // add a boolean value
  set += printIt _
  // add the main function
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    val x = iter.next.toString()
    println(x)
  }

}