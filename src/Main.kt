//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //  Для фабрики роботов требуется разработать программу, которая будет корректно склонять слово "дроид"
    //  на итоговой презентации.

    val droids = readln().toInt()

    print("За этот год мы разработали ")

    when (droids % 10) {
        0 -> print("$droids дроидов")
        1 -> print("$droids дроид")
        in 2..4 -> print("$droids дройда")
        in 5..9 -> print("$droids дройдов")
        else -> print("$droids дройдов")
    }
}
