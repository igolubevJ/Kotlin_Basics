//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Операция 1. Объединение строк(конкатенация)
    val typeName = "B2"
    val serialName = "D" + 2
    val droidName = typeName + "-" + serialName
    println(droidName)

    // Операция 2. Модификация строк
    val pair = "ПЛАНЕТА: Земля" + "\n" + "СПУТНИК: Луна"
    val spaceshipName = "КРЕЙСЕР \"Галактика\""
    println(pair)
    println(spaceshipName)

    // Операция 3. Хранение длинных строк
    val text = """
        Генерал, в этом сражении Вы одержали победу над 128 дроидами.
        Это на 17 меньше, чем в битве при Ириандии.
        Что будете делать?
    """.trimIndent()
    println(text)
}
