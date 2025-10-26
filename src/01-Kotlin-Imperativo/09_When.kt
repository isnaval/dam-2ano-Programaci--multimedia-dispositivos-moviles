fun main() {
    println("=== WHEN ===")
    print("¿Qué número del día de la semana estamos? ")
    val dia = readLine()?.toIntOrNull() ?: 0
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6, 7 -> println("Fin de semana")
        else -> println("Día no válido")
    }
    println()

    print("¿Que número del mes estamos? ")
    val mes = readLine()?.toIntOrNull() ?: 0
    val estacion = when (mes) {
        12, 1, 2 -> "Invierno"
        3, 4, 5 -> "Primavera"
        6, 7, 8 -> "Verano"
        9, 10, 11 -> "Otroño"
        else -> "mes no valido"
    }
    println("Mes $mes: $estacion\n")

    val temperatura = 28
    when {
        temperatura < 10 -> println("Frío")
        temperatura < 20 -> println("Fresco")
        temperatura < 30 -> println("Agradable")
        else -> println("Calor")
    }
    println()

    println("Opción (1-3): ")
    val opcion = readLine()?.toIntOrNull() ?: 0
    when (opcion) {
        1 -> println("Elegiste: Crear")
        2 -> println("Elegiste: Leer")
        3 -> println("Elegiste: Salir")
        else -> println("Opcion no valida")
    }
    println()
}