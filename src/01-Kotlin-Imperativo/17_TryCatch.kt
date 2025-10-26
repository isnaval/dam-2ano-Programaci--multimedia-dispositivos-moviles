fun main() {
    println("=== TRY-CATCH ===\n")
    println("---Try-catch básico: ---")
    try {
        val numero = "abc".toInt()
        println("Numero: $numero")
    } catch (e: Exception) {
        println("ERROR: No se puede convertir a número")
    }


    println("--- División segura: ---")
    val a = 10
    val b = 0
    try {
        val resultado = a / b
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("ERROR: no se puede dividir por cero")
    }

    println("--- Try-catch con finally: ---")
    try {
        println("1. Intentando oeracion...")
        val x = "10".toInt()
        println("2. Operación exitosa: $x")
    } catch (e: Exception) {
        println("2. Error en la operacion")
    } finally {
        println("3. Finally SIEMPRE se ejecta")
    }
    println()

    println("--- Try-catch como expresión: ---")
    val num1 = try {
        "100".toInt()
    } catch (e: Exception) {
        0
    }
    val num2 = try {
        "xyz".toInt()
    } catch (e: Exception) {
        0
    }
    print("num1: $num1")
    print("num2: $num2")
    println()

    println("--- EJERCICIO: Calculadora Segura ---\n")
    try {
        print("Primer numero: ")
        val n1 = readln().toDouble()
        print("Segundo numero: ")
        val n2 = readln().toDouble()
        print("Operación (+,-, *, /): ")
        val op = readln()

        val resultado = when (op) {
            "+" -> n1 + n2
            "-" -> n1 - n2
            "*" -> n1 * n2
            "/" -> {
                if (n2 == 0.0) throw ArithmeticException("División por cero")
                n1 / n2
            }

            else -> throw Exception("Operación no válida")
        }

        println("\nResultado: $n1 $op $n2 = $resultado")

    } catch (e: NumberFormatException) {
        println("\nError: Debes introducir números válidos")
    } catch (e: ArithmeticException) {
        println("\nError: ${e.message}")
    } catch (e: Exception) {
        println("\nError: ${e.message}")
    } finally {
        println("\n--- Fin de la calculadora ---")
    }
    println()

}
