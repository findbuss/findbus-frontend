package find.bus.models

data class Bus(
    val routeId: String,
    val routeColor: Long,
    val routeTextColor: Long,
    val routeLongName: String,
    val nextBus: String
)
