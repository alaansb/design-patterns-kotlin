package specifications

import domain.Pokemon

class MasterBallSpecification: PokeBallSpecification {

    override val TYPE: String = "MASTER"

    override fun isSatisfiedBy(pokemon: Pokemon): Boolean {
        return pokemon.hasSecondType && pokemon.isLegendary
    }
}