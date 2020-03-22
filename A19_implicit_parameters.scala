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

/*
Error
println(ValueProc.proc1("aaa"))
ValueProc.proc2("bbb")
*/
