fun main() {
    println("=== EJERCICIOS BASICOS ===")
    ejercicioIMC()
    println("\n" + "==".repeat(40) + "\n")
    ejercicioTabla()
}

fun ejercicioIMC() {
    println("EJERCICIO 1: Calculadora de IMC\n")
    print("Tu peso en kg: ")
    val peso = readln().toDoubleOrNull() ?: 0.0
    print("Tu altura en metros (ej: 1.75): ")
    val altura = readln().toDoubleOrNull() ?: 0.0

    if (peso > 0 && altura > 0) {
        val imc = peso / (altura * altura)

        val categoria = when {
            imc < 18.5 -> "Bajo peso"
            imc < 25.0 -> "Peso normal"
            imc < 30.0 -> "Sobrepeso"
            else -> "Obesidad"
        }

        println("\n✅ RESULTADOS:")
        println("   Peso: $peso kg")
        println("   Altura: $altura m")
        println("   IMC: ${"%.2f".format(imc)}")
        println("   Categoría: $categoria")

        // Recomendación
        val recomendacion = when {
            imc < 18.5 -> "Consulta con un nutricionista"
            imc < 25.0 -> "¡Peso saludable! Sigue así"
            imc < 30.0 -> "Considera hacer más ejercicio"
            else -> "Consulta con un médico"
        }
        println("   Recomendación: $recomendacion")
    } else {
        println("\nDatos no válidos")
    }
}

fun ejercicioTabla() {
    println("EJERCICIO 2: Tabla de Multiplicar\n")

    print("¿Qué tabla quieres ver? (1-10): ")
    val numero = readln().toIntOrNull() ?: 1

    if (numero in 1..10) {
        println("\n📋 TABLA DEL $numero:")
        println("─".repeat(20))

        for (i in 1..10) {
            val resultado = numero * i
            println("$numero x $i = $resultado")
        }

        println("─".repeat(20))

        // Suma de todos los resultados
        var suma = 0
        for (i in 1..10) {
            suma += numero * i
        }
        println("\nSuma de todos los resultados: $suma")

    } else {
        println("\nNúmero no válido. Debe estar entre 1 y 10")
    }
}