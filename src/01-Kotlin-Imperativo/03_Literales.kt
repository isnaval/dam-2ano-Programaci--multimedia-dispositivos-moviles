fun main() {
    println("=== Laterales en Kotlin ===\n")
    println("---literales numericos ---\n")
    val decimal = 100
    val hexadecimal = 0x66
    val binario = 0b1100100
    val long = 100L
    val float = 3.14f
    val double = 3.14

    println("Decimal = $decimal")
    println("Hexadecimal = $hexadecimal")
    println("Binario = $binario")
    println("Long = $long")
    println("Float = $float")
    println("Double= $double\n")

    println("---Guiones bajos para legibilidad ---\n")
    val millones = 1_000_000
    val tarjeta = 1234_5678_9012_3456L
    val bytes = 0xFF_EC_DE_5E
    val bits = 0b1101_0101_1010_1100

    println("1_000_000 = $millones")
    println("Tarjeta: $tarjeta")
    println("Bytes hex: $bytes")
    println("Bits: $bits\n")

    println("--- Literales de caracteres ---")
    val letra = 'A'
    val digito = '5'
    val tab = '\t'
    val nuevaLinea = '\n'
    val unicode = '\u0041'

    println("Letra = $letra")
    println("Digito = $digito")
    println("Tab $tab")
    println("Unicode = $unicode")

    println("--- Literales de cadenas ---\n ")
    val simple = "Texto simple"
    val conEscape = "Primera línea\nSegunda linea"
    val rawString = """ 
        Linea 1
        Linea 2
        Linea 3
        """.trimIndent()

    println("String simple = $simple")
    println("Con Escape = ")
    println(conEscape)
    println("\nRaw string (triple comilla) = ")
    println(rawString)

    println(" Booleanos y null ---\n")
    val verdadero = true
    val falso = false
    val nullable: String? = null
    val nonNull: String = "Valor"

    println("True = $verdadero")
    println("False = $falso")
    println("nullable = $nullable")
    println("nonNull = $nonNull\n")

    println("--- EJERCICIO CONVERSION ---\n")
    val numero = 255
    println("Numero decimal = $numero")
    println("En binario = ${numero.toString(2)}")
    println("En hexadecimal = ${numero.toString(16)}")
    println("En octal = ${numero.toString(8)}")


}
