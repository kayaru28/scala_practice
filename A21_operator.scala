case class Vec(x: Double, y: Double) {
  def +(that: Vec) = Vec(this.x + that.x, this.y + that.y)
  def closs(that: Vec) = (this.x + that.x) * (this.y + that.y)
}

val vector1 = Vec(1.0, 1.0)
val vector2 = Vec(2.0, 2.0)

val vector3 = vector1 + vector2
println(vector3)
println(vector1 closs vector2)



