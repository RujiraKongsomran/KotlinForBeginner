fun main() {
    // Basic data types

    // String
    val exampleString = "Biwberry"
    val exampleString1 = "\"Biwberry\nBranner\""
    val exampleRawString = """ "Biwberry
Branner" """
    print(exampleRawString)


    // Long
    val exampleLong = 2899999999999
    val exampleLong1 = 28L
    val exampleLong2: Long = 28


    // Byte
    val exampleByte: Byte = 28


    // Double
    val exampleDouble = 2.8


    // Float
    val exampleFloat = 2.8F


    val example1 = 2.8E3
    val example2 = 2.8E-3
    val example3 = 2_000_000.8

    // Int -> Long
    val exampleNumber = 2_000_000
    val exampleLn: Long = exampleNumber.toLong()

    // Double -> Long
    val exampleNumber1 = 2_000_000.12
    val exampleLn1: Long = exampleNumber1.toLong()
    val exampleNumber2: Double = 2_000_000.12

    // Char
    val exampleChar = "?"

    // Char -> Int
    //val exampleInt: Int = exampleChar.toInt()

    // Boolean
    val exampleBoolean = false
}