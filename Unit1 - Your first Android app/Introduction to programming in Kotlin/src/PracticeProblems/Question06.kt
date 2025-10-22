package PracticeProblems

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val subtractResult = subtract(firstNumber, secondNumber)
    val anotherSubtractResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractResult")
}

// Define add() function below this line
fun add(a: Int, b: Int): Int {
    return a + b
}

// Define subtract() function
fun subtract(a: Int, b: Int): Int {
    return a - b
}