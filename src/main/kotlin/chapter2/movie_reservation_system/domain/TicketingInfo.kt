package chapter2.movie_reservation_system.domain

data class TicketingInfo(
    val show: Show,
    val peopleCount: Int,
    val normalPrice: Int,
    val paymentPrice: Int
)
