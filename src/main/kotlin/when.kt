fun main() {
    val time = -12

    if (time in 0..11) {
        println("Good morning")
    } else if (time == 12) {
        println("Time for lunch!")
    } else {
        println("Good day!")
    }

    val greeting = if (time in 0..11) {
        "Good morning!"
    } else if (time == 12) {
        "Time for lunch!"
    } else {
        "Good day!"
    }

    println(greeting)
    println("Good ${if (time < 12) "morning" else "day"}!")

    when (time) {
        in 0..11 -> {
            println("Good morning")
        }
        12 -> {
            println("Time for lunch!")
        }
        else -> {
            println("Good day!")
        }
    }

    when (4) {
        in 0..5 -> println("why up so early?")
        in 0..11 -> println("Good morning")
        12 -> println("Time for lunch!")
        else -> println("Good day!")
    }

    val greeting1 = when (4) {
        in 0..5 -> "why up so early?"
        in 0..11 -> "Good morning"
        12 -> "Time for lunch!"
        else -> "Good day!"
    }

    println("greeting1: $greeting1")

}