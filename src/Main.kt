//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val range1 = 1 .. 5
    println(range1)

    // until (..<)
    val firstSaleDay = 1
    val lastSaleDay = 14
    val salesDays = firstSaleDay until lastSaleDay
    println(salesDays)

    // downTo
    val cookingTime = 10

    val countdown = cookingTime downTo 1
    println(countdown)

    // step
    val range2 = 10 .. 20
    val range3 = 10 .. 20 step 2

    println("range2: " + range2)
    println("range3: " + range3)

    val range4 = 10 downTo 1 step 2
    println("range4: " + range4)

    // in
    val range = 10 .. 20
    val itemValue = 12

    if (itemValue in range) {
        println("Число $itemValue есть в заданном диапазоне")
    }
    else {
        println("Числа $itemValue в заданном диапазоне нет")
    }
}
