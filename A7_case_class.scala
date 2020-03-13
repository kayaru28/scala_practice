case class profile(name:String,age:Int,height:Double)

val member1 = profile("takahiro",24,161.2)
val member2 = profile("takahiro",24,161.4)
val member3 = profile("kana",21,151.2)
println(member1==member2)
println(member3)
println(member3.name)
