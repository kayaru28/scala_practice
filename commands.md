scala's grammar memo


## function
```scala
val add = (x: Int, y: Int) => x + y
```

## method
```scala
def for10(): Unit ={}
def for10(): Int ={}
def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
```


## if
```scala
if(age < 18){
    println("aaaa")
}else{
    println("vvv")
}
```

## while
```scala
do {
    println(i)
    i+=1
}while(i<10)
```

## for
```scala
for(x <- 1 to 4; y <- 1 until 4 ){
    println(x + ":" + y)
}
for(x <- 1 to 4; y <- 1 until 4 if x!=y){
    println(x + ":" + y)
}
```

## match
```scala
var one=2
one match{
    case 1 => println("one")
    case 2 => println("two")
    case 3 => println("three")
}
```

## class
```scala
class test(val x:Int,val y:Int){
    var _xx = 1 //public
    private var _x = 0 //private
    def inc(z:Int):Int = { x+z }
    def xx = _xx
}
val impl = new test(1,2)
val impl = new test(y=2)
```

### inherit
```scala
class test(val x:Int,val y:Int){
    def inc(z:Int):Int = { x+z }
}
class tester(override val x:Int,override val y:Int) extends test(x,y)
class tester2(val x1:Int,val y1:Int) extends test(x1,y1){
    override def inc(zz:Int):Int={x1}
}
```
### trait
```scala
trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}
class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}
val iter = new IntIterator(10)
```

## tuple
```scala
val ingredient = ("Sugar" , 25, 5.01)

println(ingredient._1) // Sugar
println(ingredient._2)
println(ingredient._3)

val (name, quantity,value) = ingredient
println(name) // Sugar
println(quantity) // 25
println(value)

val numPairs = List((2, 5,"a"), (3, -7,"b"), (20, 56,"c"))
for ((a, b,c) <- numPairs) {
  println(c)
}
```
