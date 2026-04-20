//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //
    // {название_переменной}.to{тип_данных}()
    //

    val longValue: Long = 1234567890123L
    val intValue1: Int = longValue.toInt()

    println(intValue1)

    val doubleValue: Double = 3.99
    val intValue2: Int = doubleValue.toInt()

    println(intValue2)

    val floatValue: Float = 3.14f
    val doubleValue2: Double = floatValue.toDouble()

    println(doubleValue2)

    val float2Value: Float = 3.14f
    val doubleValue3: Double = float2Value.toDouble()

    println(doubleValue3)

    val stringValue = "false"
    val booleanValue1 = stringValue.toBoolean()

    println(stringValue + ": " + booleanValue1)

    val stringValue2 = "true"
    val booleanValue2 = stringValue2.toBoolean()

    println(stringValue2 + ": " + booleanValue2)

    val stringValue3 = "0"
    val booleanValue3 = stringValue3.toBoolean()
    println(stringValue3 + ": " + booleanValue3)

    val stringValue4 = "1"
    val booleanValue4 = stringValue4.toBoolean()
    println(stringValue4 + ": " + booleanValue4)

    val stringValue5 = "-1"
    val booleanValue5 = stringValue5.toBoolean()
    println(stringValue5 + ": " + booleanValue5)

    val stringValue6 = "Hello"
    val booleanValue6 = stringValue6.toBoolean()
    println(stringValue6 + ": " + booleanValue6)

    val stringValue7 = " "
    val booleanValue7 = stringValue7.toBoolean()
    println(stringValue7 + ": " + booleanValue7)
}
