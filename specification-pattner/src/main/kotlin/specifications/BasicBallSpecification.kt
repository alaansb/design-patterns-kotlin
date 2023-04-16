package specifications

import domain.Pokemon

class BasicBallSpecification: PokeBallSpecification {
    override val TYPE: String = "BASIC"

    override fun isSatisfiedBy(pokemon: Pokemon): Boolean {
        return AndSpecification(
            NotSpecification(MasterBallSpecification()),
            NotSpecification(UltraBallSpecification())
        ).isSatisfiedBy(pokemon)
    }
}