fun saludar(nombre: String = "Usuario", saludar: String = "Hola") {
    println("$saludar son $nombre")
}

fun crearUsuario(
    nombre: String,
    edad: Int = 18,
    ciudad: String = "Madrid",
    activo: Boolean = true
) {
    println("Usuario: $nombre, $edad años, $ciudad, Activo: $activo")
}

fun obtenerMinMax(numeros: List<Int>): Pair<Int, Int> {
    return Pair(numeros.minOrNull() ?: 0, numeros.maxOrNull() ?: 0)
}

fun main() {
    println("Parámetros por defecto:")
    saludar()
    saludar("Ana")
    saludar("Pedro", "Buenos días")
    println()

    println("Argumentos nombrados:")
    crearUsuario("Juan")
    crearUsuario("María", edad = 25)
    crearUsuario("Carlos", ciudad = "Barcelona", edad = 30)
    crearUsuario(nombre = "Laura", activo = false, edad = 22)
    println()

    println("Retornar múltiples valores:")
    val numeros = listOf(5, 2, 8, 1, 9, 3)
    val (minimo, maximo) = obtenerMinMax(numeros)
    println("Lista: $numeros")
    println("Mínimo: $minimo, Máximo: $maximo")
    println()

    print("Tu peso en KG: ")
    val peso = readln().toDoubleOrNull() ?: 0.0
    print("Tu altura en metros (ej: 1.83): ")
    val altura = readln().toDoubleOrNull() ?: 0.0

    calcularMostrarIMC(peso, altura)
}

fun calcularIMC(peso: Double, altura: Double): Double {
    return if (altura > 0) peso / (altura * altura) else 0.0
}

fun obtenerCategoriaIMC(imc: Double): String {
    return when {
        imc < 18.5 -> "Bajo peso"
        imc < 25.0 -> "Peso normal"
        imc < 30.0 -> "Sobrepeso"
        else -> "Obesidad"
    }
}

fun calcularMostrarIMC(peso: Double, altura: Double) {
    if (peso > 0 && altura > 0) {
        val imc = calcularIMC(peso, altura)
        val categoria = obtenerCategoriaIMC(imc)

        println("\nResultados:")
        print("IMC: ${"%.2f".format(imc)}")
        print("Categoría: $categoria")
    } else {
        println("Datos no válidos")
    }
    println()
}