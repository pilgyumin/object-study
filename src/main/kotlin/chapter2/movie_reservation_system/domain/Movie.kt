package chapter2.movie_reservation_system.domain

data class Movie(
    val title: String,
    val duringMinutes: Int,
    val price: Int,
    val discountPolicy: DiscountPolicy,
    val discountCondition: DiscountCondition
)
