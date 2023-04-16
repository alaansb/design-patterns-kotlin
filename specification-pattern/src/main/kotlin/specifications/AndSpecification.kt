package specifications

import domain.Pokemon

class AndSpecification(
    private var leftSpecification: PokeBallSpecification,
    private var rightSpecification: PokeBallSpecification
): PokeBallSpecification {

    override val TYPE: String = ""

    override fun isSatisfiedBy(pokemon: Pokemon): Boolean {
        return leftSpecification.isSatisfiedBy(pokemon) && rightSpecification.isSatisfiedBy(pokemon)
    }
}