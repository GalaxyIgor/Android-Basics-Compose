package PracticeProblems

fun main() {
    // Testando a função com os exemplos fornecidos
    println(compareScreenTime(300, 250))  // true
    println(compareScreenTime(300, 300))  // false
    println(compareScreenTime(200, 220))  // false
}

fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}