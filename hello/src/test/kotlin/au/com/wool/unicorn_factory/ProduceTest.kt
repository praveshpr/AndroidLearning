package au.com.wool.unicorn_factory
import kotlin.test.Test //  not org.junit
import junit.framework.TestCase.assertEquals
class ProduceTest {

    private val basket: List<Produce> = listOf(
        Produce.Vegetable("Onion", "brown", isRoot = false),
        Produce.Vegetable("Carrot", "orange", isRoot = true),
        Produce.Cereal("Cornflakes", "Kellogg's"),
        Produce.Cereal("Rice", "India Gate"),
    )

    @Test
    fun smokeTest() {
    }

    @Test
    fun testFilterCereal() {

        val expectedCereals = listOf(
            Produce.Cereal("Cornflakes", "Kellogg's"),
            Produce.Cereal("Rice", "India Gate"),
        )

        val actualCereals = filterCereal(basket)

        assertEquals(2, actualCereals.size)
        assertEquals(expectedCereals, actualCereals)
    }

    @Test
    fun testFilterByName() {
        val expectedProduce = listOf(
            Produce.Vegetable("Carrot", "orange", true),
        )

        val actualProduce = filterName(basket, "Carrot")

        assertEquals(1, actualProduce.size)
        assertEquals(expectedProduce, actualProduce)
    }

    @Test
    fun testGetName() {
        val expectedNames = listOf(
            "Onion", "Carrot", "Cornflakes", "Rice",
        )
        val actualNames = getName(basket)

        assertEquals(expectedNames, actualNames)

    }

    @Test
    fun testDescription() {

        val expectedDescription = listOf(
            "Onion is not root",
            "Carrot is root",
            "Cornflakes from Kellogg's",
            "Rice from India Gate"
        )
        val actualDescription = getDescription(basket)

        assertEquals(expectedDescription, actualDescription)

    }




}
