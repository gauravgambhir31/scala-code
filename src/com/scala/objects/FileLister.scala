package com.scala.objects

/**
  * Created by ggambhir on 1/1/17.
  */
object FileLister {

  def main(args: Array[String]): Unit = {
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)
  }
}
