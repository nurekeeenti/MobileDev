fun main() {
    println("Part 1, Task 1")
    val age: Int = 18
    val height: Double = 1.89
    val isStudent: Boolean = true
    val name: String = "Nursultan Zhumagali"

    println("Age: $age")
    println("Height: $height")
    println("Is Student: $isStudent")
    println("Name: $name")

    println("Part 2, Task 1")
    if (age < 18) {
        println("You are a minor.")
    } else if (age in 18..65) {
        println("You are an adult.")
    } else {
        println("You are a senior.")
    }

    println("Part 2, Task 2")
    when (age) {
        in 0..5 -> println("You are a toddler.")
        in 6..12 -> println("You are a child.")
        in 13..17 -> println("You are a teenager.")
        in 18..64 -> println("You are an adult.")
        in 65..Int.MAX_VALUE -> println("You are a senior.")
        in Int.MIN_VALUE..-1 -> println("Invalid age.")
        else -> println("Unknown age category.")
    }

    println("Part 3, Task 1")
    if (isStudent && age in 18..65) {
        println("You are an adult student.")
    } else if ((age < 18 || age > 65) && isStudent) {
        println("You are a student but not an adult.")
    } else {
        println("You are not a student or not in a specific category.")
    }

    println("Part 4, Task 1")
    println("For Loop:")
    for (i in 1..10) {
        println(i)
    }

    println("Part 4, Task 2")
    println("While Loop:")
    var num = 10
    while (num >= 1) {
        println(num)
        num--
    }

    println("Part 4, Task 3")
    println("Repeat While Loop:")
    var input: Int
    do {
        println("Enter a number (0 to exit):")
        input = readlnOrNull()?.toIntOrNull() ?: 0
        if (input != 0) println("You entered: $input")
    } while (input != 0)

    println("Part 5, Task 1")
    println("Mini Calculator:")
    println("Enter first number:")
    val num1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println("Enter second number:")
    val num2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("Choose operation: +, -, *, /")
    val operation = readlnOrNull()

    when (operation) {
        "+" -> println("Result: ${num1 + num2}")
        "-" -> println("Result: ${num1 - num2}")
        "*" -> println("Result: ${num1 * num2}")
        "/" -> {
            if (num2 != 0.0) {
                println("Result: ${num1 / num2}")
            } else {
                println("Error: Division by zero.")
            }
        }
        else -> println("Invalid operation.")
    }
}
