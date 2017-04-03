package org.uniBright.scala

class A(n: Int) {
  var value = n
}

class B(n: Int) {
  val value = new A(n)
}

object Test1 {
  def main(args:Array[String]):Unit={
    val x = new B(5)
//    x = new B(6)
//    x.value = new A(6)
    x.value.value = 6
    println(x.value.value)
  }
}