package au.com.wool.unicorn_factory
import kotlinx.serialization.Serializable

//serialization is used to convert objects into json
@Serializable
//data calss is used to hold the properties
//we can create functions as well, but it is not recommended
data class Fruit(
    val name: String,
    val color: String,
    val isSweet: Boolean,
    val origin: String? = null,
)
