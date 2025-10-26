fun saludar() {
    println("Hola desde una función")
}

fun saludarPersona(nombre: String) {
    println("Hola $nombre")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    saludar()
    println()
    saludarPersona("Carlos")
    saludarPersona("Ana")
    println()

    val resultado = sumar(5, 10)
    println("5+3 = $resultado")
    println("4x7 = ${multiplicar(4, 7)}")
    println()

    val area = calcularAreaRectangulo(5.0, 3.0)
    println("Área del rectángulo: $area")
    println()

    println("¿Es 4 par? ${esPar(4)}")
    println("¿Es 7 par? ${esPar(7)}")
    println()

    print("Primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("\nResultados:")
    println("Suma: ${sumarDecimal(num1, num2)}")
    println("Resta: ${restar(num1, num2)}")
    println("Multiplicación: ${multiplicarDecimal(num1, num2)}")
    println("División: ${dividir(num1, num2)}")
    println()

}

fun calcularAreaRectangulo(base: Double, altura: Double): Any {
    return base * altura

}

fun restar(a: Double, b: Double): Double {
    return a - b
}

fun dividir(a: Double, b: Double): Double {
    return if (b != 0.0) {
        a / b
    } else {
        0.0
    }
}

fun multiplicarDecimal(a: Double, b: Double): Double {
    return if (b != 0.0) {
        a * b
    } else {
        0.0
    }
}

fun sumarDecimal(a: Double, b: Double): Double {
    return (a + b)
}

fun esPar(a: Int): Boolean {
    return a % 2 == 0
}

fun multiplicar(a: Int, b: Int): Int {
    return a * b

}

