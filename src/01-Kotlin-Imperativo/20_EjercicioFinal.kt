fun main() {
    menuPrincipal()
}

fun menuPrincipal() {
    var salir = false
    println("=== SISTEMA DE EJERCICIOS KOTLIN ===")
    while (!salir) {
        mostrarMenu()
        println("Seleccionar una opción: ")
        val opcion = readln().toIntOrNull() ?: 0
        println()

        when (opcion) {
            1 -> calculadoraBasica()
            2 -> calculadoraIMC()
            3 -> tablasMultiplicar()
            4 -> juegoAdivinanza()
            5 -> analizadorTexto()
            6 -> conversorTemperatura()
            0 -> {
                println("👋 ¡Hasta luego!")
                salir = true
            }

            else -> println("Opción no válida\n")
        }

        if (!salir) {
            println("\nPresionar Enter para continuar...")
            readln()
            println("\n" + "==".repeat(40) + "\n")
        }
    }
}

fun mostrarMenu() {
    println("═".repeat(40))
    println("MENÚ PRINCIPAL")
    println("═".repeat(40))
    println("1. Calculadora Básica")
    println("2. Calculadora de IMC")
    println("3. Tablas de Multiplicar")
    println("4. Juego de Adivinanza")
    println("5. Analizador de Texto")
    println("6. Conversor de Temperatura")
    println("0. Salir")
    println("═".repeat(40))
}

fun calculadoraBasica() {
    println("CALCULADORA BÁSICA\n")

    try {
        print("Primer número: ")
        val num1 = readln().toDouble()

        print("Segundo número: ")
        val num2 = readln().toDouble()

        print("Operación (+, -, *, /): ")
        val op = readln()

        val resultado = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else {
                println("❌ Error: División por cero")
                return
            }

            else -> {
                println("❌ Operación no válida")
                return
            }
        }

        println("\nResultado: $num1 $op $num2 = $resultado")

    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}


fun calculadoraIMC() {
    println("CALCULADORA DE IMC\n")

    print("Peso (kg): ")
    val peso = readln().toDoubleOrNull() ?: 0.0

    print("Altura (m): ")
    val altura = readln().toDoubleOrNull() ?: 0.0

    if (peso > 0 && altura > 0) {
        val imc = peso / (altura * altura)

        val categoria = when {
            imc < 18.5 -> "Bajo peso"
            imc < 25.0 -> "Peso normal"
            imc < 30.0 -> "Sobrepeso"
            else -> "Obesidad"
        }

        println("\nIMC: ${"%.2f".format(imc)} - $categoria")
    } else {
        println("Datos no válidos")
    }
}


fun tablasMultiplicar() {
    println("️  TABLAS DE MULTIPLICAR\n")

    print("¿Qué tabla? (1-10): ")
    val numero = readln().toIntOrNull() ?: 1

    if (numero in 1..10) {
        println("\nTabla del $numero:")
        println("─".repeat(20))
        for (i in 1..10) {
            println("$numero x $i = ${numero * i}")
        }
    } else {
        println(" Número no válido")
    }
}


fun juegoAdivinanza() {
    println(" JUEGO DE ADIVINANZA\n")
    println("Adivina el número entre 1 y 20")

    val numeroSecreto = (1..20).random()
    var intentos = 0
    var adivinado = false
    val maxIntentos = 5

    while (!adivinado && intentos < maxIntentos) {
        print("\nIntento ${intentos + 1}/$maxIntentos: ")
        val intento = readln().toIntOrNull() ?: 0
        intentos++

        when {
            intento == numeroSecreto -> {
                println(" ¡Correcto! Lo adivinaste en $intentos intentos")
                adivinado = true
            }

            intento < numeroSecreto -> println("⬆️  Más alto")
            intento > numeroSecreto -> println("⬇️  Más bajo")
        }
    }

    if (!adivinado) {
        println("\n😢 Se acabaron los intentos. Era: $numeroSecreto")
    }
}


fun analizadorTexto() {
    println(" ANALIZADOR DE TEXTO\n")

    print("Escribe un texto: ")
    val texto = readln()

    val palabras = texto.split(" ").filter { it.isNotEmpty() }
    val vocales = texto.lowercase().count { it in "aeiouáéíóú" }
    val consonantes = texto.lowercase().count { it in "bcdfghjklmnñpqrstvwxyz" }

    println("\n ANÁLISIS:")
    println("   Caracteres totales: ${texto.length}")
    println("   Palabras: ${palabras.size}")
    println("   Vocales: $vocales")
    println("   Consonantes: $consonantes")
    println("   Primera letra: ${texto.firstOrNull() ?: "N/A"}")
    println("   Última letra: ${texto.lastOrNull() ?: "N/A"}")
    println("   En mayúsculas: ${texto.uppercase()}")
    println("   En minúsculas: ${texto.lowercase()}")
    println("   Invertido: ${texto.reversed()}")
}


fun conversorTemperatura() {
    println("  CONVERSOR DE TEMPERATURA\n")
    println("1. Celsius a Fahrenheit")
    println("2. Fahrenheit a Celsius")

    print("\nOpción: ")
    val opcion = readln().toIntOrNull() ?: 0

    print("Temperatura: ")
    val temp = readln().toDoubleOrNull() ?: 0.0

    when (opcion) {
        1 -> {
            val fahrenheit = (temp * 9 / 5) + 32
            println("\n $temp°C = ${"%.2f".format(fahrenheit)}°F")
        }

        2 -> {
            val celsius = (temp - 32) * 5 / 9
            println("\n $temp°F = ${"%.2f".format(celsius)}°C")
        }

        else -> println(" Opción no válida")
    }
}
