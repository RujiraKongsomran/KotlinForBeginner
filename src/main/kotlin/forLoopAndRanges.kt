fun main() {
    val names = arrayOf("Jim", "Jenny", "Barbie")
    names[0] = "Berry"

    println("Number of elements: ${names.size}")
    println("First element: ${names[0]}")
    println("Last element: ${names[names.size - 1]}")
    println("Last element: ${names[names.lastIndex]}")
    println("Last element: ${names.last()}")

    for (name in names) {
        println(name)
    }

    for (name in names) println(name)


    val name1 = "Hello"
    for (name in name1) println(name)

    for (i in 1..10) println(i) // display 1 - 10

    for (i in 1 until 10) println(i) // display 1 - 9

    for (i in 10 downTo 1) println(i) // display 10 - 1

    for (i in 1..10 step 2) println(i) // display 1 3 5 7 9

    for (i in 1.rangeTo(10).step(2)) println(i) // display 1 3 5 7 9

    for (i in 10L downTo 1) println(i) // display 10 - 1

    for (i in 'a'..'z' step 2) println(i) // display a c e g i ...

    println(names.indices)


}