package com.scala.classes

/**
  * Created by ggambhir on 1/3/17.
  */
trait Similarity {

  def isSimilar(x : Any) : Boolean

  def isNotSimilar (x:Any) : Boolean = ! isSimilar(x)
}
