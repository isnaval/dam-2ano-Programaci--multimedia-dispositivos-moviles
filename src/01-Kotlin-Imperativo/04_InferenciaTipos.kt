fun main() {
    println("=== INFERENCIA DE TIPOS ===\n")
    println("--- Inferencia básicas ---\n")
    val numero = 42
    val decimal = 3.14
    val texto = "Hola"
    val boolean = true

    println("Val numero = 42 -> ${numero::class.simpleName}")
    println("Val decimal = 3.14 -> ${decimal::class.simpleName}")
    println("Val texto = \'Hola' -> ${texto::class.simpleName}")
    println("Val boolean = true -> ${boolean::class.simpleName}")

    println("--- Tipo explicito vs inferencia ---\n")
    val enteroExplicito: Int = 100
    val enteroInferido = 100

    println("Explicito: $enteroExplicito")
    println("Inferido: $enteroInferido")

    println("--- Tipos por defecto ---\n")
    val entero = 100
    val enteroLargo = 100L
    val decimal2 = 100.0
    val flotante = 100.0f

    println("100 -> ${entero::class.simpleName} (por defecto)")
    println("100L -> ${enteroLargo::class.simpleName} (sufijo L)")
    println("100.0 -> ${decimal2::class.simpleName} (por defecto)")
    println("100.0f. -> ${flotante::class.simpleName} (por defecto)")

    println("--- Inferencia en operaciones ---\n")
    val suma = 10 + 20
    val division = 10.0 / 3.0
    val concatenacion = "Hola" + "Mundo"
    val compracion = 5 > 3

    println("10+20 -> ${suma::class.simpleName}")
    println("10.0/3.0 -> ${division::class.simpleName}")
    println("\"Hola\" + \"Mundo\" -> ${concatenacion::class.simpleName}")
    println("5>3 -> ${concatenacion::class.simpleName}")

    println("---Ejercicio: verificación de tipos ---\n")
    val a = 10
    val b = 20.5
    val c = "Kotlin"
    val d = true
    val e = 10L

    println("a = 10 -> ${a::class.simpleName}")
    println("b = 20.5 -> ${b::class.simpleName}")
    println("c = \"Kotlin\" -> ${c::class.simpleName}")
    println("d = true -> ${d::class.simpleName}")
    println("e = 10L -> ${e::class.simpleName}")
}