scala's grammar memo
## block
```scala
def for10(): Unit ={}
def for10(): Int ={}
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
    def inc(z:Int):Int = { x+z }
}
val impl = new test(1,2)
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

```scala
```
