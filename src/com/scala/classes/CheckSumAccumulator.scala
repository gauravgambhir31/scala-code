package com.scala.classes

import scala.collection.mutable.Map

/**
  * Created by ggambhir on 12/29/16.
  */


class CheckSumAccumulator {

  private var sum = 0 ;

  def add(b: Byte) { sum += b }

  def checkSum() : Int = ~(sum & 0xFF) + 1



}

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
}