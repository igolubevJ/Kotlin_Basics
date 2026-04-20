//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val minTemperature: Byte = -128
    val maxTemperature: Byte = 127
    println("Температура на планете в диапазоне от " + minTemperature + " до " + maxTemperature + " градусов")

    val coordinateX: Short = -32000
    val coordinateY: Short = 32000
    println("Клад находится по координатам: " + coordinateX + "; " + coordinateY)

    val minFloor: Int = -2_000_000_000
    val maxFloor: Int = 2_000_000_000
    println("В нашем небоскребе минимальный этаж " + minFloor + ", а максимальный " + maxFloor)

    val minPrice: Long = 0
    val maxPrice: Long = 2_000_000_000_000_000
    println("Минимизация цены на товар " + minPrice + ", а максимальная " + maxPrice)

    // Без знаковые типы данных
    val initialDroidCount: UByte = 0U
    val finalDroidCount: UByte = 255U
    println("В начале производственного процесса количество дройдов составляет " + initialDroidCount + " единиц, а в конце достигает цифры " + finalDroidCount);

    val carCount: UShort = 60000U
    println("За неделю мы продали больше " + carCount + " спидеров")

    val startCount: UInt = 1_000_000U
    println("В нашей галактике примерно " + startCount + " обитаемых миров")

    val shootCount: ULong = 1_000_000_000_000_000U
    println("За одно сражение в космосе из пушек вылетает около " + shootCount + " снарядов")
}
