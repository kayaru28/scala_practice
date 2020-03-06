

class test(val x:Int,val y:Int){
    def inc(z:Int):Int = { x+z }
}


val impl = new test(1,2)
println(impl.inc(1))
println(impl.inc(10 ))

