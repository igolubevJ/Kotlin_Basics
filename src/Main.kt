fun main(){
    val planets = arrayOf("Меркурий", "Венера", "Земля", "Марс")
    val priceOfOrders = arrayOf(1250, 350, 7_490, 19_900)
    val statusOfOrder = arrayOf(true, false, true, true)

    // Обращение к элементу
    val planetName = planets[0]
    println(planetName)

    // print все элементы массива
    for (planetName in planets) {
        println(planetName)
    }

    // index
    for (index in planets.indices) {
        if (index + 1 < planets.size) {
            println(planets[index] + " и " + planets[index + 1])
        }
    }

    // требуется выводить только определенные элементы
    val orders = arrayOf("Заказ 1", "Заказ 2", "Заказ 3", "Заказ 4")

    println("Список приоритетных заказов:")
    for (index in orders.indices) {
        if ((index + 1) % 2 == 0) {
            println(" - ${orders[index]}")
        }
    }

    println("Список неприоритетных заказов:")
    for (index in orders.indices) {
        if ((index + 1) % 2 != 0) {
            println(" - ${orders[index]}")
        }
    }
}