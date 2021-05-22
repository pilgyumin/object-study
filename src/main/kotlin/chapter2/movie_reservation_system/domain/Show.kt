package chapter2.movie_reservation_system.domain

import java.time.LocalDateTime

data class Show(
    val movie: Movie,
    val showDateTime: LocalDateTime,
    val order: Int,
    val seatInfo: String
)
