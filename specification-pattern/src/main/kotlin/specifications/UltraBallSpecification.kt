package specifications

import domain.Pokemon

class UltraBallSpecification: PokeBallSpecification {

    override val TYPE: String = "ULTRA"

    override fun isSatisfiedBy(pokemon: Pokemon): Boolean {
        return !pokemon.isLegendary && pokemon.hasSecondType
    }
}