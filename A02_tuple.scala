//error
val ingredient = ("Sugar" , 25, 5.01)

println(ingredient._1) // Sugar
println(ingredient._2)
println(ingredient._3)

val (name, quantity,value) = ingredient
println(name) // Sugar
println(quantity) // 25
println(value)

val numPairs = List((2, 5,"a"), (3, -7,"b"), (20, 56,"c"))
for ((a, b,c) <- numPairs) {
  println(c)
}



