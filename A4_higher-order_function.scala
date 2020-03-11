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



