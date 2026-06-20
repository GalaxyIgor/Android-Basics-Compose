package UseNullabilityInKotlin

fun main() {
    // Fist example
    // val favoriteActor = "Sandra Oh"

    // Second example
    // val favoriteActor = null

    // Third example
    // var favoriteActor: String = "Sandra Oh"
    // favoriteActor = "Meryl Streep"

    // var favoriteActor: String = "Sandra Oh"
    // favoriteActor = null // This will make an error, you will need "?"

    // var favoriteActor: String? = "Sandra Oh"
    // favoriteActor = null // this can run


    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)

    var number: Int? = 10
    println(number)

    number = null

    println(number)
}

