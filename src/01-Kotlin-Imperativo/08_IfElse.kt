fun main() {
    println("=== IF Y ELSE ===\n")

    //1
    val edad = 20
    if (edad >= 18) {
        println("Eres mayor de edad\n")
    }
    //2
    val temperatura = 25
    if (temperatura > 30) {
        println("Hace calor")
    } else {
        println("Temperatura agradable\n")
    }
    //3
    val nota = 75
    if (nota >= 20) {
        println("Sobresaliente")
    } else if (nota >= 70) {
        println("Notable")
    } else if (nota >= 50) {
        println("Aprobado")
    } else {
        println("Suspenso")
    }

    //4
    val numero = 10
    val tipo = if (numero % 2 == 0) "Par" else "Impar"
    println("$numero es $tipo\n")

    //5
    println("OPERADORES:")
    println("==  igual")
    println("!=  diferente")
    println(">   mayor que")
    println("<   menor que")
    println(">=  mayor o igual")
    println("<=  menor o igual\n")

    val a = 10
    val b = 20
    println("a = $a, b = $b")
    println("a == b: ${a == b}")
    println("a != b: ${a != b}")
    println("a > b:  ${a > b}")
    println("a < b:  ${a < b}\n")

    print("Tu edad: ")
    val tuEdad = readLine()?.toIntOrNull() ?: 0

    if (tuEdad < 13) {
        println("Eres un niño")
    } else if (tuEdad < 28) {
        println("Eres un adolescente")
    } else if (tuEdad < 65) {
        println("Eres un adulto")
    } else {
        println("Eres un adulto mayor")
    }
    println()
}