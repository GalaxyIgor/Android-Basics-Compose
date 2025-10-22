package WriteConditionalsInKotlin.BasicWhen

fun main() {
    val trafficLightColor = "Black"
    // val trafficLightColor = "Yellow"
    // val trafficLightColor = "Green"
    // val trafficLightColor = "Black"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}