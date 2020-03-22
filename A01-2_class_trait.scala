//error

trait animal[B]{
  //var weight:Long
  //var height:Long
  var weight:Long = 10
  val height:Long = 5
  def open():Unit={
    println("aaa")
  }
}

class cat() extends animal[Long]{
  override def open():Unit={
    weight=3
    //height=5
    println(weight)
    println(height)
  }
}

val tama = new cat()
tama.open()







