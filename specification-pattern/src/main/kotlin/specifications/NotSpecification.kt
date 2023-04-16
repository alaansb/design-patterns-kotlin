package specifications

import domain.Pokemon

class NotSpecification(
    private var specification: PokeBallSpecification,
): PokeBallSpecification {
    override val TYPE: String = ""

    override fun isSatisfiedBy(pokemon: Pokemon): Boolean {
        return !specification.isSatisfiedBy(pokemon)
    }
}