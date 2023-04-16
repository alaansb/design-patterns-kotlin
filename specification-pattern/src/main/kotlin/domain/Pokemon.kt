package domain

data class Pokemon (
    val name: String,
    val type: String,
    val region: String,
    val hasSecondType: Boolean,
    val isLegendary: Boolean
)