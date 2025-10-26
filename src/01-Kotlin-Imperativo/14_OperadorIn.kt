fun main() {
    println("=== OPERADOR IN ===\n")
    val edad = 25
    println("Edad: $edad")
    println("¿Está en 18..30? ${edad in 18..30}")
    println("¿Está en 1..17? ${edad in 1..17}")
    println()

    val numero = 15
    println("Número: $numero")
    println("¿No está en 1..10? ${numero !in 1..10}")
    println()

    val frutas = listOf("Manzana", "Banana", "Naranja")
    val fruta = "Banana"
    println("Frutas: $frutas")
    println("¿'$fruta' está en la lista? ${fruta in frutas}")
    println("¿'Uva' está en la lista? ${"Uva" in frutas}")
    println()

    print("Tu nota (0-100): ")
    val nota = readLine()?.toIntOrNull() ?: 0
    when {
        nota in 90..100 -> println("Sobresaliente")
        nota in 70..89 -> println("Notable")
        nota in 50..69 -> println("Aprobado")
        nota in 0..49 -> println("Suspenso")
        else -> println("Nota no válida")
    }
    println()

    print("Tu edad: ")
    val tuEdad = readLine()?.toIntOrNull() ?: 0
    if (tuEdad in 18..65) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }

    println()

}