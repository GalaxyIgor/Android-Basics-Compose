package WriteConditionalsInKotlin.BasicIfElse

fun main() {
    val trafficLightColor = "Red"
    // val trafficLightColor = "Yellow"
    // val trafficLightColor = "Green"
    // val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }

}