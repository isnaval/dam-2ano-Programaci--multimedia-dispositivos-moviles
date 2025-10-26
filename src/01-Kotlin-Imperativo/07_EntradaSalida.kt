fun main() {
    println("=== ENTRADA Y SALIDA ===\n")
    println("--- Salida ---")
    println("println imprime con salto de linea")
    print("print imprime sin salto")
    print(" de linea \n\n")

    println("--- Entrada ---")
    print("Como te llamas? ")
    val nombre = readLine() ?: "Desconocido"
    println("Hola, $nombre\n")

    println("--- Convertir a número ---")
    print("Cuantos años tienes? ")
    val edad = readLine()?.toIntOrNull() ?: 0
    println("Tienes $edad años\n")

    println("--- Operador Elvis ---")
    println("Introduce un número: ")
    val numero = readLine()?.toIntOrNull() ?: 0
    println("Número (o 0 si falla): $numero\n")

    println("--- Calculadora Simple ---")
    println("Primer número:  ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    println("Segundo número:  ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    println("\nResultados: ")
    println("$a + $b = ${a + b}")
    println("$a - $b = ${a - b}")
    println("$a x $b = ${a * b}")
    if (b != 0.0) {
        println("$a / $b = ${a / b}")
    }
    println()


}