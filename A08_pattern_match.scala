abstract class animal
case class dog(name:String,voice:Int) extends animal
case class cat(name:String,voice:Int) extends animal
case class elephant(name:String,voice:Int,nose:Int) extends animal

def getName(individual: animal):String={
    individual match{
        case dog(name2:String,voice:Int) =>
            s"I am $name2"
        case cat(name2:String,voice:Int) =>
            s"my name is $name2"
        case elephant(name:String,voice:Int,nose:Int) =>
            s"my name is $name and nose is $nose"
    }
}

var individual:Array[animal]=null
individual = new Array[animal](3)
individual(0) = dog("poti",12)
individual(1) = cat("tama",12)
individual(2) = elephant("zou",12,15)
for(x <- 0 to 2){
    println(getName(individual(x)))
}