fun main() {
    sayHelloKotlin("Barbies", 5)
    sayHelloKotlin2("Barbies", 3)
    val max = getMax(12, 2)
    println(max)

    val max2 = getMax2(12, 2)
    println(max2)

}

fun sayHelloKotlin(name: String, reps: Int) {
    for (i in 0 until reps) {
        println("Hello, $name!")
    }
}

fun sayHelloKotlin2(name: String, reps: Int) {
    var repsLeft = reps
    while (repsLeft > 0) {
        println("Hi, $name!")
        repsLeft--
    }
}

fun getMax(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}

fun getMax2(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
    println("This will not be printed")
}