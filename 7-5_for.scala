

def for10(): Unit ={
    for(x <- 1 to 4; y <- 1 until 4 ){
        println(x + ":" + y)
    }
    for(x <- 1 to 4; y <- 1 until 4 if x!=y){
        println(x + ":" + y)
    }


}

for10


