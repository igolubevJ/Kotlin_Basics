//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    when (переменная) {
        значение1 -> {если значение_переменной == значение1, выполнится код в этом блоке }
        значение2 -> {
          если значение_переменной == значение2, выполнится код в этом блоке
        }
        значение3, значение4 -> {
          если значение_переменной == значение3 или значение4, выполнится код в этом
          блоке
        }
        else {
          если предыдущие условия не выполнились, выполнится код в этом блоке
        }
    }
    */

    val rank = "Капитан"
    var discount = 0

    when (rank) {
        "Солдат" -> discount = 5
        "Капрал", "Сержант" -> discount = 7
        "Лейтинант" -> discount = 15
        "Капитан" -> discount = 25
        "Коммандер" -> discount = 35
        "Маршал-коммандер" -> discount = 45
        else -> discount = 0
    }

    println("Ваша скидка: $discount")

    // Проверка диапазонов чисел

    val currentTemperature = 25

    when(currentTemperature) {
        in -273..0 -> {
            println("Критически низкая температура! Активируем системы обогрева.")
        }
        in 1..20 -> {
            println("Температура ниже комфортной. Увеличиваем мощность обогрева.")
        }
        in 21..25 -> {
            println("Температура в норме. Поддерживаем текущие настройки.")
        }
        in 26..30 -> {
            println("Температура выше комфортной. Включаем вентиляцию.")
        }
        in 31..100 -> {
            println("Критически высокая температура! Активируем системы охлаждения.")
        }
        else -> {
            println("Температура за пределами допустимого диапазона. Активируем аварийный протокол.")
        }
    }

    // Проверка комплексных условий
    val energyLevel = 75
    val shieldStatus = "Active"
    val enemyDistance = 1000

    when {
        energyLevel > 90 && shieldStatus == "Active" -> {
            println("Все системы в норме. Переходим в режим гипер-прыжка.")
        }
        energyLevel < 30 || shieldStatus == "Damaged" -> {
            println("Критическое состояние систем. Активируем аварийный протокол.")
        }
        enemyDistance < 500 && shieldStatus == "Inactive" -> {
            println("Враг приближается, а щиты неактивны. Активируем щиты и готовим оружие.")
        }
        else -> {
            println("Все системы функционируют в штатном режиме. Продолжаем полет.")
        }
    }

    // Объединение операторов if и when
    val name1 = "Энакин"
    val money = 1000
    var price = 0

    when (name1) {
        "Энакин" -> {
            if (money < 1000) {
                price = 500
            }
            else if (money >= 1000 && money < 2000) {
                price = 1000
            }
            else {
                price = 3000
            }
        }

        "Асока" -> {
            if (money < 1000) {
                price = 500
            }
            else if (money >= 1000 && money < 2000) {
                price = 1500
            }
            else {
                price = 3500
            }
        }
    }

    println("Для Вас специальная цена: $price")
}
