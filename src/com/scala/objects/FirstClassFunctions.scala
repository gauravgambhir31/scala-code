package com.scala.objects

/**
  * Created by ggambhir on 1/5/17.
  */
object FirstClassFunctions extends App{



  def sum(start: Int, end: Int, tempSum:Int) : Int = {
    if(start == end) tempSum + end else sum(start+1,end,start + tempSum)
  }

  def recursiveSum(n1:Int, n2:Int) : Int = {
    val start = if (n2 > n1) n1 else n2
    val end =   if (n1 > n2) n1 else n2
    val res = sum(start,end,0)
    res
  }

  println("Recursive sum= " + recursiveSum(6,10))

  val list = List(-11,8,9,-9,5,4,20)


   list.foreach((x:Int) => print(x + " "))

   println()
  //Other way
  list.foreach(x => print(x + " "))
  println()
  //Another way
  list.foreach(print)
  println()
  //Filter list
  val positiveList =  list.filter(x => x>0)

  positiveList.foreach(x => print(x + " "))
  println()
  val negativeList =  list.filter( _ < 0)

  negativeList.foreach(x => print(x + " "))


}
