package WriteConditionalsInKotlin.BasicWhen

fun main() {
    val x: Any = 20

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.") // meio que fora as condições acima procura por um inteiro
        else -> println("x isn't an integer number.")
    }
}

