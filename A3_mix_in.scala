abstract class A {
  val message: String
}
class B extends A {
  val message = "aaaabb cCCCCs"
}
trait C extends A {
  def loudMessage = message.toUpperCase()
}
trait S {
  def echoMessage = "echoooooo"
}
trait T {
  //def echoMessage = "echoo" <-NG
  def echoMessage2 = "echo------"
}
class D extends B with C with S with T

val d = new D
println(d.message)
println(d.loudMessage)
println(d.echoMessage)
//println(d.super[S].echoMessage)  <-NG












