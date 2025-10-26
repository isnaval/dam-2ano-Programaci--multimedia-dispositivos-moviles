fun main() {
    println("=== OPERADORES LÓGICOS ===\n")
    println("--- AND (&&) - ambas son true")
    val edad = 25
    val tieneLicencia = true
    if (edad >= 18 && tieneLicencia) {
        println("Puede conducir")
    }
    println()
    println("--- OR (||) - Al menos una debe ser true ---")
    val esFinDeSemana = false
    val esFeriado = true

    if (esFinDeSemana || esFeriado) {
        println("No hay que trabajar")
    }
    println()

    println("--- NOT (!) - Invierte el valor ---")
    val llueve = false

    if (!llueve) {
        println("Puedes salir sin paraguas")
    }
    println()

    val temperatura = 25
    val esSoleado = true
    if (temperatura > 20 && esSoleado) {
        println("Buen día para la playa")
    }
    println()

    println("--- TABLA DE VERDAD: --- ")
    println("true  && true  = ${true && true}")
    println("true  && false = ${true && false}")
    println("false && true  = ${false && true}")
    println("false && false = ${false && false}")
    println()

    println("true  || true  = ${true || true}")
    println("true  || false = ${true || false}")
    println("false || true  = ${false || true}")
    println("false || false = ${false || false}")
    println()

    println("!true  = ${!true}")
    println("!false = ${!false}")
    println()

    println("--- Ejercicio de validación: ---")
    print("Tu edad: ")
    val tuEdad = readLine()?.toIntOrNull() ?: 0
    print("¿Tienes entrada? (si/no): ")
    val tieneEntrada = readLine()?.lowercase() == "si"
    if (tuEdad >= 18 && tieneEntrada) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }
    println()
}