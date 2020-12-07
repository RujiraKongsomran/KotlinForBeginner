fun main() {
    val names = arrayOf("Jim", "Jenny", "Barbie")
    names[0] = "Berry"
    println("Number of elements: ${names.size}")
    println("First element: ${names[0]}")
    println(names[0][2])
    println(names[0].length)

    val numbers = arrayOf(1, "Hi", 'b')

    val numbers1 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    print(numbers1[1][1])
}