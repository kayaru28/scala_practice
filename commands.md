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

### higher order
```scala
object testtt{
    val multipy=(x: Int,y: Int) => x * y
    def add(x: Int, y: Int): Int = x + y
   
    def calc(calc_method: (Int,Int) => Int): Int = {
        calc_method(1,2)
    }
    def calcBy(x:Int,y:Int,calc_method: (Int,Int) => Int): Int = {
        calc_method(x*2,y)
    }
}

println(testtt.calc(testtt.add))
println(testtt.calc(testtt.multipy))
println(testtt.calcBy(2,3,testtt.add))
println(testtt.calcBy(2,3,testtt.multipy))
```

### factorial
```scala
def factorial_test(x:Int):Int={
    def add1(x:Int):Int={
        x+1
    }
    var y=add1(x)
    y=add1(y)
    y
}
println(factorial_test(3))
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

### mix in
```scala
abstract class A { val message: String }
class B extends A { val message = "aaaabb cCCCCs"}
trait C extends A { def loudMessage = message.toUpperCase()}
trait S {  def echoMessage = "echoooooo" }
trait T {
  //def echoMessage = "echoo" <-NG
  def echoMessage2 = "echo------"
}
class D extends B with C with S with T
val d = new D
{println(d.message);println(d.loudMessage);println(d.echoMessage)}
```
### case
```scala
case class profile(name:String,age:Int,height:Double)

val member1 = profile("takahiro",24,161.2)
val member2 = profile("takahiro",24,161.4)
val member3 = profile("kana",21,151.2)
println(member1==member2)
println(member3)
println(member3.name)
```

### unapply
```scala
object UserID{
    def apply(name:String) = s"$name--generatedID--yyyymmdd"
    def unapply(user_id:String):Option[String] = {
        val stringArray: Array[String] = user_id.split("--")
        if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
    }
}
val user = UserID("takuya")
println(user)
println(UserID(user))
```

### generics
```scala
class test[A,B]{
    def push(x:A){println(x)}
    def pushB(y:B){println(y)}
}

val impl = new test[Int,String]
impl.push(1)
impl.pushB("1")
```

### inner
```scala

class School(){
    var members: List[Student] = Nil
    class Student(name:String){
        var name_ = name
        var skill_math = 0
        var skill_english = 0
    }
    def math_traing(){
        for(student <- members){
            student.skill_math = student.skill_math + 1
            println("%s:%d".format(student.name_,student.skill_math))
        }
    }
    def entry(new_comer:Student){
        members = new_comer :: members
    }
}

val high_school: School = new School
val taro: high_school.Student = new high_school.Student("taro")
var ziro = new high_school.Student("ziro")
high_school.entry(taro)
high_school.math_traing
high_school.entry(ziro)
high_school.math_traing
```

### abstract members
```scala
trait Values{
    type U
    type T
    val v1:T
    val v2:T
    var v3:U
}
abstract class Values2(){
    type U
    type T
    var v1:T
    var v2:U
}

class C_Values() extends Values{
    type U = Int
    type T = String
    val v1 = "aaa"
    val v2 = "vvv"
    var v3 = 3 //need
}
class C_Values2() extends Values2(){
    type U = Int
    type T = String
    var v1 = "aaa" //need
    var v2 = 2 //need
}
var impl = new C_Values
println(impl.v1.getClass)
println(impl.v2.getClass)
println(impl.v3.getClass)
var impl2 = new C_Values2
println(impl2.v1.getClass)
println(impl2.v2.getClass)
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

## pattern match
```scala
abstract class animal
case class dog(name:String,voice:Int) extends animal
case class cat(name:String,voice:Int) extends animal
case class elephant(name:String,voice:Int,nose:Int) extends animal

def getName(individual: animal):String={
    individual match{
        case dog(name2:String,voice:Int) =>
            s"I am $name2"
        case cat(name2:String,voice:Int) =>
            s"my name is $name2"
        case elephant(name:String,voice:Int,nose:Int) =>
            s"my name is $name and nose is $nose"
    }
}
```

## operator
```scala
case class Vec(x: Double, y: Double) {
  def +(that: Vec) = Vec(this.x + that.x, this.y + that.y)
  def closs(that: Vec) = (this.x + that.x) * (this.y + that.y)
}

val vector1 = Vec(1.0, 1.0)
val vector2 = Vec(2.0, 2.0)

val vector3 = vector1 + vector2
println(vector3)
println(vector1 closs vector2)
```

## implicit parameters
```scala
abstract class Value[A]{
    def replay:A
    def echo(x:A):Unit
}
implicit val intValue: Value[Int] = new Value[Int]{
    def replay:Int = 100
    def echo(x:Int):Unit ={ println(x) }
}
object ValueProc{
    implicit val stringValue: Value[String] = new Value[String]{
        def replay:String = "100"
        def echo(x:String):Unit ={ println(x) }
    }

    def proc1[A](v:A)(implicit proc:Value[A]): A = {
        proc.replay
    }
    def proc2[A](v:A)(implicit proc:Value[A]): Unit = {
        proc.echo(v)
    }
    def proc_exe:Unit={
        println(ValueProc.proc1(5))
        println(ValueProc.proc1("aaa"))
        ValueProc.proc2(54)
        ValueProc.proc2("bbb")
    }
}
ValueProc.proc_exe
println(ValueProc.proc1(5))
ValueProc.proc2(54)
```
