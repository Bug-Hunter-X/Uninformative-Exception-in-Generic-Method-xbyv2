```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == value) {
      return x
    } else {
      throw new Exception("Values are not equal")
    }
  }
}

val myObject = new MyClass[Int](5)
val result = myObject.myMethod(5)
println(result)

val myObject2 = new MyClass[String]("hello")
val result2 = myObject2.myMethod("world")
println(result2)
```