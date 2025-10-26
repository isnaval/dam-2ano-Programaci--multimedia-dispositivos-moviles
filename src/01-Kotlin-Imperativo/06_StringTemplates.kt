fun main() {
    println("=== STRING TEMPLATES === \n")
    println("--- Template siemple: ---")
    val nombre = "Ana"
    val edad = 25
    println("Hola soy $nombre y tengo $edad años\n")
    println("El año que viene tendre ${edad + 1} años\n")
    println("Mi nombre tiene ${nombre.length} letras\n")

    println("--- Operaciones: ---")
    val precio = 10.0
    val descuento = 0.20
    val precioFinal = precio - (precio * descuento)
    println("Precio orignal: $precio. Descuento ${descuento * 100}%. Precio final: $precioFinal\n")


    val nota = 75
    println("Nota: $nota. Estado: ${if (nota >= 50) "Aprobado" else "Suspenso"}\n")
    println("Tu nombre: ")
    val tuNombre = readLine() ?: "Usuario"
    println("Tu edad: ")
    val tuEdad = readLine()?.toIntOrNull() ?: 0
    println("Hola $tuNombre, tienes $tuEdad")
}