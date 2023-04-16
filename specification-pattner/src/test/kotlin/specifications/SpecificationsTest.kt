package specifications

import domain.Pokemon
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class SpecificationsTest {
    private lateinit var pokeBallSpecifications: ArrayList<PokeBallSpecification>

    @BeforeTest
    fun setUp() {
        pokeBallSpecifications = arrayListOf(
            BasicBallSpecification(),
            UltraBallSpecification(),
            MasterBallSpecification()
        )
    }

    @Test
    fun `It should use MasterBall when Pokemon is legendary and has second type`() {

        val pokemon = Pokemon(
            name = "Mew",
            type = "psychic",
            region = "Kanto",
            hasSecondType = true,
            isLegendary = true
        )

        val pokeBall = pokeBallSpecifications.last { pokeBallSpecification ->
            pokeBallSpecification.isSatisfiedBy(
                pokemon
            )
        }.TYPE

        assertEquals("MASTER", pokeBall)
    }

    @Test
    fun `It should use UltraBall when Pokemon is not legendary and has second type`() {

        val pokemon = Pokemon(
            name = "Mew",
            type = "psychic",
            region = "Kanto",
            hasSecondType = true,
            isLegendary = false
        )

        val pokeBall = pokeBallSpecifications.last { pokeBallSpecification ->
            pokeBallSpecification.isSatisfiedBy(
                pokemon
            )
        }.TYPE

        assertEquals("ULTRA", pokeBall)
    }

    @Test
    fun `It should use Basic when Pokemon is not legendary and not has second type`() {

        val pokemon = Pokemon(
            name = "Mew",
            type = "psychic",
            region = "Kanto",
            hasSecondType = false,
            isLegendary = false
        )

        val pokeBall = pokeBallSpecifications.last { pokeBallSpecification ->
            pokeBallSpecification.isSatisfiedBy(
                pokemon
            )
        }.TYPE

        assertEquals("BASIC", pokeBall)
    }

    @Test
    fun `It should use Basic when Pokemon is legendary and not has second type`() {

        val pokemon = Pokemon(
            name = "Mew",
            type = "psychic",
            region = "Kanto",
            hasSecondType = false,
            isLegendary = true
        )

        val pokeBall = pokeBallSpecifications.last { pokeBallSpecification ->
            pokeBallSpecification.isSatisfiedBy(
                pokemon
            )
        }.TYPE

        assertEquals("BASIC", pokeBall)
    }

}