fun main() {
    println("=== VAL vs VAR en Kotlin ===\n")

    println("--- VAL inmutable ---\n")
    val nombre = "Carlos"
    val edad = 25
    val PI = 3.14159
    println("val nombre = $nombre")
    println("val edad = $edad")
    println("val PI = $PI\n")

    println("--- VAL mutable ---\n")
    println("Valores iniciales: ")
    var contador = 0
    var mensaje = "Hola"
    var temperatura = 20.5
    println("contador = $contador")
    println("mensaje = $mensaje")
    println("temperatura = $temperatura\n")

    println("Valores reasinados: ")
    contador = 1
    mensaje = "Amigo"
    temperatura = 35.0
    println("contador = $contador")
    println("mensaje = $mensaje")
    println("temperatura = $temperatura\n")

    println("---Constantes ---\n")
    val MAX_INTENTOS = 3
    val NOMBRE_APP = "MiApp"
    val VERSION = "1.0.0"
    println("MAX_INTENTOS = $MAX_INTENTOS")
    println("NOMBRE_APP = $NOMBRE_APP")
    println("VERSION = $VERSION\n")

    println("---Ejemplos prácticos ---\n")
    val sitioWeb = "www.ejemplo.com"
    var visitas = 0
    println("Sitio web: $sitioWeb")
    println("Visitas iniciales: $visitas")
    visitas += 1
    println("Despues de 1 visita: $visitas")

    println("---")
    val precioBase = 100.0
    var precioFinal = precioBase
    var descuento = 0.0
    descuento = 0.10
    precioFinal = precioBase * (1 - descuento)
    println("Con 10% de descuento: $precioFinal")

    println("--- Operadores de incremento ---\n")
    var num = 5
    println("Valor inicial: $num\n")
    num++;
    println("Valor incrmentado: $num\n")
    num *= 2
    println("Valor multiplicado por 2: $num\n")


}