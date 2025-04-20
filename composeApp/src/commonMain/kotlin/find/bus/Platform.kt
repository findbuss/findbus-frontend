package find.bus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform