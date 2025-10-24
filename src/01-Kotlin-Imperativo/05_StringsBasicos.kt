fun main() {
    println("=== STRING BÁSICOS ===\n")

    val nombre = "Carlos"
    val apellidos = "Garcia"
    val nombreCompleto = nombre + " " + apellidos
    println("Nombre completo: ${nombreCompleto}\n")

    val texto = "Kotlin"
    println("Texto: ${texto}")
    println("Longitud: ${texto.length}")
    println("Primera letra: ${texto[0]}")
    println("ültima letra: ${texto[texto.length - 1]}")
    println("Mayúsculas: ${texto.uppercase()}")
    println("Minusculas: ${texto.lowercase()}")
    println("Invertido: ${texto.reversed()}")

    val frase = "Hola Mundo"
    println("Frase: $frase")
    println("¿Contiene mundo?: ${frase.contains("Mundo")}")
    println("Empieza con Hola?: ${frase.startsWith("Hola")}\n")

    println("Escribe una palabra: ")
    val palabra = readLine() ?: "Kotlin"
    println("Tu palabra: ${palabra}")
    println("Tiene ${palabra.length} letras")
    println("En mayusculas: ${palabra.uppercase()}\n")
}