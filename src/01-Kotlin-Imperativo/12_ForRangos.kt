fun main() {
    println("=== FOR Y RANGOS ===\n")

    println("--- FOR con 1..5: ---")
    for (i in 1..5) {
        print("$i ")
    }
    println("\n")

    println("--- FOR con 1..5: ---")
    for (i in 1 until 5) {
        print("$i - ")
    }
    println("\n")

    println("--- FOR descendente (10 downTo 1): ---")
    for (i in 10 downTo 1) {
        print("$i  ")
    }
    println("\n")

    println("--- OPERADOR IN: ---")
    val edad = 25
    println("Edad: $edad")
    println("¿Esta en 18...30? ${edad in 18..30}")
    println("¿Está en 1 ...17? ${edad in 1..17}")

    println("--- FOR con listas: ---")
    val frutas = listOf("Manzana", "Banana", "Naranja")
    for (fruta in frutas) {
        print("- $fruta")
    }
    println("\n")

    print("--- ¿Qué tabla quieres? ---")
    val tabla = readLine()?.toIntOrNull() ?: 1
    println("\nTabla del $tabla")
    for (i in 1..10) {
        println("$tabla x $i = ${tabla * i}")
    }
    println("\n")

    print("--- Sumar del 1 al: --- ")
    val limite = readLine()?.toIntOrNull() ?: 10
    var suma = 0
    for (i in 1..limite) {
        suma += i
    }
    println("Suma: $suma\n")


}