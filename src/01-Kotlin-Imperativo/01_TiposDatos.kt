fun main() {
    println("=== Tipos de datos de Kotlin ===\n")

    println("--- Numeros enteros ---\n")
    val byte: Byte = 127
    val short: Short = 3267
    val int: Int = 3213132
    val long: Long = 356546546465L

    println("--- Numeros decimales  ---\n")
    val float: Float = 3.14f
    val double: Double = 3.1464648797

    println("--- Otros tipos  ---\n")
    val caracter: Char = 'K'
    val texto: String = "Kotlin"
    val boolean: Boolean = true

    println("--- Operaciones Básicas ---\n")
    val a = 10
    val b = 3
    println("a = $a, b = $b")
    println("Suma: $a + $b = $(a+b)\n")
    println("Resta: $a - $b = $(a-b)\n")
    println("División: 10/3 = (Int / Int ) división entera)\n")
    println("División: 10.0/3.0 = (Double / Double = decimal)\n")


    println("--- Calculo de área Básicas ---\n")
    val base: Double = 50.0
    val altura: Double = 3.0
    val area = base * altura

    println("Rectanculo: Base: $base, Altura: $altura, Área: $(base * altura)")


}





