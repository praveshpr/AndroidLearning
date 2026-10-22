package au.com.wool.unicorn_factory

import kotlinx.serialization.json.Json

fun main() {
    println("Hello, world!")

    val fruit = Fruit(
        name = "Banana",
        color = "yellow",
        isSweet = true,
        // origin = null,
    )
    println(Json.encodeToString(fruit))

    //this is the recomended way to do serialization, not the above one
    Fruit(
        name = "Apple",
        color = "red",
        isSweet = true,
    )
        .let { Json.encodeToString(it) }
        .let { println(it) }
    //let block is used for chaining

}
