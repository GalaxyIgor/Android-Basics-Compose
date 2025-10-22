fun main() {
    displayWeather("Ankara", 27, 31, 82)
    displayWeather("Tokyo", 32, 36, 10)
    displayWeather("Cape Town", 59, 64, 2)
    displayWeather("Guatemala City", 50, 55, 7)
}

fun displayWeather(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: ${chanceOfRain}%")
    println()
}
