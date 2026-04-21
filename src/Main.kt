//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Цикл while
    var droidCount = 100
    val jediPower = 3

    while (droidCount > 0) {
        droidCount -= jediPower
    }

    println("Дройды закончились")

    // Цикл do..while
    val salary = 1000
    var jediMoney = 0

    do {
        jediMoney += salary
    } while (jediMoney == 0)

    print("У вас появились деньги")
}
