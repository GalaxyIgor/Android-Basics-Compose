package PracticeProblems

fun main() {
    val steps = 4000
    val caloriesBurned = calculateCaloriesBurned(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun calculateCaloriesBurned(steps: Int): Double {
    val caloriesBurnedPerStep = 0.04
    val totalCaloriesBurned = steps * caloriesBurnedPerStep
    return totalCaloriesBurned
}