//fun main (args: Array<String>){
//    println("Hello World")
//}

//fun main(){
//    var x = 3
//    val name = "Zaid"
//    x = x * 10
//    println("x is $x")
//
//    println("x before the while loops is : $x")
//    while(x > 20){
//        x = x - 1
//        print("$x-")
//    }
//    println("x AFTER the while loop is: $x")
//
//    for (i in 1..10){
//        x =x + 1
//        print("$x+")
//    }
//    println("x AFTER the FOR loop is: $x")
//
//    if (x == 20){
//        println("x must be twenty")
//    }else{
//        println("x isn't twenty")
//    }
//
//    var y = 9
//    if(x < y){
//        println("x is SMALL")
//    }else if(x > y){
//        println("x is LARGE")
//    }else{
//        println("x is equal to y")
//    }
//
//    when {
//        x < y -> println("x is SMALL")
//        x > y -> println("x is LARGE")
//        else -> println("x is equal to y")
//    }
//}
//
//var x = 5/3
//var y = 5L

fun main(args: Array<String>){
    var y: Int
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegrante")
    var x = 0
    while (x < 4){
        val index = arrayOf(1, 3, 4, 2)
        y = index[x]
        x = x + 1
        println("Fruit = ${fruit[y]}")
    }
}