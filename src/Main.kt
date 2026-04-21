fun main() {
    // Последовательность чисел
    val droidCount = 100
    val droidCost = 1_000_000
    var orderCost = 0

    for (droidNumber in 1..droidCount) {
        orderCost += droidCost
    }

    println("Общая стоимость партии дроидов: $orderCost")

    // until

    val firstSaleDay = 1
    val lastSaleDay = 14
    val saleDays = firstSaleDay until lastSaleDay

    for (day in saleDays) {
        println("Сегодня $day день продаж")
    }

    // downTo

    val cookingTime = 10
    val range = cookingTime downTo 1

    for (currentTime in range) {
        println("До приготовления осталось секунд: $currentTime")
    }

    println("Заказ готов")

    // step

    val range1 = 10..20
    val range2 = 10..20 step 2
    val range3 = 10 downTo 1
    val range4 = 10 downTo 1 step 2

}