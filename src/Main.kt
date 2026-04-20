//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    if (условие, возвращает true или false) {
        // код, который будет выполнен, если условие истино
    }
    else if (условие, возвращает true или false) {
        // код, который будет выполнен, если условие истино,
        // а предыдущее условие ложно
    }
    else {
        // код, который будет выполнен, если другие условия
        // окозались ложными
    }
    */

    val cloneCount = 0
    val droidCount = 10

    if (cloneCount > 0 && droidCount > 0) {
        println("Дройды атакуют.")
        println("клоны защищаются.")
    }
    else if (cloneCount == 0 && droidCount > 0) {
        println("Дройды атакуют. Клонов нет.")
    }
    else {
        print("Дройдов нет. Клонов нет.")
    }
}
