package au.com.wool.unicorn_factory

fun filterCereal(produceList: List<Produce>): List<Produce.Cereal> {
    return produceList.filterIsInstance<Produce.Cereal>()
}
fun filterName(produceList: List<Produce>, name: String): List<Produce> {
    return produceList.filter { it.name == name }
}
fun getName(produceList: List<Produce>): List<String> {
    return produceList.map { it.name }
}
fun getDescription(produceList: List<Produce>): List<String> =
    produceList.map {
        when (it) {
            is Produce.Vegetable ->
                "${it.name} is ${if (it.isRoot) "root" else "not root"}"

            is Produce.Cereal ->
                "${it.name} from ${it.brand}"
        }
    }
