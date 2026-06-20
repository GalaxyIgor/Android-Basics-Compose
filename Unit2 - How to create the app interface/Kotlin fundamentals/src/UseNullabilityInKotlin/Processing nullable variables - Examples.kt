fun main() {

    // 1. Non-nullable variable
    val nonNullableActor: String = "Sandra Oh"
    println(nonNullableActor.length)

    // 2. Nullable variable with safe call
    val nullableActor: String? = null
    println(nullableActor?.length)

    // 3. Nullable variable with Elvis operator
    val lengthOfName = nullableActor?.length ?: 0
    println("Length: $lengthOfName")

    // 4. Null check using if/else (smart cast)
    val anotherActor: String? = "Sandra Oh"

    if (anotherActor != null) {
        println("Actor name length: ${anotherActor.length}")
    } else {
        println("No actor informed")
    }
}
