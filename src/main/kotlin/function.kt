fun main() {
    sayHelloKotlin("Barbies", 5)
    sayHelloKotlin2("Barbies", 3)

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