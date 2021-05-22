package chapter2.movie_reservation_system.domain

import java.time.LocalDateTime

data class Period(
    val startDate: LocalDateTime,
    val endDate: LocalDateTime
)
