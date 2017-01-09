package com.scala.classes

/**
  * Created by ggambhir on 12/30/16.
  */
class Rational(n: Int, d: Int) {
require(d != 0)
  val numer = n
  val denom = d

  def this(n: Int) = this(n,1)

 // println("Created " + n + "/" + d)

  override def toString: String = numer + "/" + denom

  def +(that : Rational) : Rational =   new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def lessThan(that : Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that : Rational) = if(lessThan(that)) that else this

  def  + (n: Int ) = new Rational(numer + n * denom, denom)

  def  * (rational: Rational) : Rational = new Rational(numer * rational.numer, denom * rational.denom)

  def * (n : Int) : Rational = new Rational(numer * n, denom)

  def - (rational: Rational) = new Rational(numer * rational.denom - rational.numer * denom, denom * rational.denom)

  def - (n : Int) = new Rational(numer - denom * n, denom)

  def / (rational: Rational) = new Rational(numer * rational.denom, denom * rational.numer)

  def / (n : Int) =  new Rational(numer,denom * n)


}

