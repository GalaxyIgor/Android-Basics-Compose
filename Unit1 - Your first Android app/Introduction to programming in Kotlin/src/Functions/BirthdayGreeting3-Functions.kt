package Functions

fun main() {
    //val greeting = birthdayGreeting3()
    //println(greeting)
    println(birthdayGreeting())

}

fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
