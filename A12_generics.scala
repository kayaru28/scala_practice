

class test[A,B]{
    def push(x:A){println(x)}
    def pushB(y:B){println(y)}
}

val impl = new test[Int,String]
impl.push(1)
impl.pushB("1")

val impl2 = new test[String,Int]
impl2.push("1")
impl2.pushB(1)




