case class profile(name:String,age:Int,height:Double)
case class license(name:String,age:Int)

val value_int = 123
val value_double = 123.0
val value_string = "abc"
val value_profile=profile("aa",1,2.0)
val value_license=license("aa",1)

println(value_int.getClass)
println(value_double.getClass)
println(value_string.getClass)
println(value_profile.getClass)
println(value_license.getClass)


