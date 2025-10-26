fun main() {
    println("=== WHILE Y DO-WHILE ===\n")
    println("--- WHILE - Contar del 1 al 5: ---")
    var contador = 1
    while (contador <= 5) {
        println("$contador")
        contador++
    }
    println("\n")

    println("--- WHILE - Sumar números: ---")
    var numero = 1
    var suma = 0
    while (numero <= 10) {
        suma += numero
        numero++
    }
    println("Suma del 1 al 10: $suma\n")

    println("--- DO-WHILE - Se ejecuta al menos una vez: ---")
    var intentos = 0
    do {
        intentos++
        println("Intengo $intentos")
    } while (intentos < 3)
    println()

    println("--- Diferencia ---")
    var condicion = false
    println("While (no se ejecuta): ")
    while (condicion) {
        println("Eso no se imprime")
    }
    println("Do-While (se ejecuta una vez):")
    do {
        println("Esto SÍ se imprime")
    } while (condicion)
    println()

    println("--- BREAK - Salir del bucle: ---")
    var i = 1
    while (i <= 10) {
        if (i == 5) {
            break
        }
        println("$i")
        i++
    }
    println("\n")

    println("--- CONTINUE - Saltar iteración: ---")
    var j = 0
    while (j < 10) {
        j++
        if (j % 2 == 0) {
            continue
        }
        println("$j")
    }
    println("\n")

    println("--- EJERCICIO: Adivina el número (1-10) ---")
    val numeroSecreto = (1..10).random()
    var adivinado = false
    var intentosJuego = 0
    while (!adivinado && intentosJuego < 3) {
        print("Intento ${intentosJuego + 1}: ")
        val intento = readLine()?.toIntOrNull() ?: 0
        intentosJuego++

        if (intento == numeroSecreto) {
            println("!Correcto!")
            adivinado = true
        } else if (intento < numeroSecreto) {
            println("Muy bajo")
        } else {
            println("Muy alto")
        }
    }
    if (!adivinado) {
        println("El número era: $numeroSecreto")
    }
    println()


}