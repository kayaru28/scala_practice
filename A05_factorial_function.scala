def factorial_test(x:Int):Int={
    def add1(x:Int):Int={
        x+1
    }
    var y=add1(x)
    y=add1(y)
    y
}
println(factorial_test(3))