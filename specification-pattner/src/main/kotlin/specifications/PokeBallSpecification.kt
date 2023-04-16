package specifications

import domain.Pokemon

interface PokeBallSpecification {

    val TYPE: String

    fun isSatisfiedBy(pokemon: Pokemon): Boolean
}