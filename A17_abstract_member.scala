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




