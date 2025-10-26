fun main() {
    println("=== EJERCICIOS INTERMEDIOS ===")
    ejercicioFizzBuzz()
    println("\n" + "==".repeat(40) + "\n")
    ejercicioNumerosPrimos()
}

fun ejercicioFizzBuzz() {
    println("EJERCICIO 1: FizzBuzz\n")
    println("Reglas: ")
    println("  • Múltiplo de 3 → Fizz")
    println("  • Múltiplo de 5 → Buzz")
    println("  • Múltiplo de 3 y 5 → FizzBuzz")
    println("  • Otros → El número\n")

    print("Hasta que número: ")
    val limite = readln().toIntOrNull() ?: 30
    println("\nResultado: ")
    for (i in 1..limite) {
        val resultado = when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
        print("$resultado ")
        if (i % 10 == 0) println()
    }
    println()


    var fizz = 0
    var buzz = 0
    var fizzBuzz = 0
    for (i in 1..limite) {
        when {
            i % 15 == 0 -> fizzBuzz++
            i % 3 == 0 -> fizz++
            i % 5 == 0 -> buzz++
        }
    }
    println("\nESTADÍSTICAS:")
    println("   Fizz: $fizz")
    println("   Buzz: $buzz")
    println("   FizzBuzz: $fizzBuzz")
}

fun ejercicioNumerosPrimos() {
    println("EJERCICIO 2: Números Primos\n")
    print("Encontrar primos hasta: ")
    val limite = readln().toIntOrNull() ?: 50

    println("\nNúmeros primos hasta $limite:")

    val primos = mutableListOf<Int>()

    for (numero in 2..limite) {
        if (esPrimo(numero)) {
            primos.add(numero)
            print("$numero ")
        }
    }

    println("\n")
    println("RESULTADOS:")
    println("   Total de primos encontrados: ${primos.size}")
    println("   Primer primo: ${primos.firstOrNull() ?: "Ninguno"}")
    println("   Último primo: ${primos.lastOrNull() ?: "Ninguno"}")

    if (primos.size > 0) {
        val suma = primos.sum()
        val promedio = suma.toDouble() / primos.size
        println("   Suma de todos: $suma")
        println("   Promedio: ${"%.2f".format(promedio)}")
    }
}

fun esPrimo(numero: Int): Boolean {
    if (numero < 2) return false
    if (numero == 2) return true
    if (numero % 2 == 0) return false

    for (i in 3..Math.sqrt(numero.toDouble()).toInt() step 2) {
        if (numero % i == 0) return false
    }

    return true
}



