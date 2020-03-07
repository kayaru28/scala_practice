

class test(val x:Int,val y:Int){
    def inc(z:Int):Int = { x+z }
}

class tester(override val x:Int,override val y:Int) extends test(x,y)
class tester2(val x1:Int,val y1:Int) extends test(x1,y1){
    override def inc(zz:Int):Int={x1}
}


val impl = new test(1,2)
val impl1 = new tester(1,2)
val impl2 = new tester2(1,2)
println(impl.inc(1))
println(impl1.inc(1))
println(impl2.inc(1))