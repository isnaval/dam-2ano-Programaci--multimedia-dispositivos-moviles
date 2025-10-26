fun main() {
    println("=== FOR CON STEP ===\n")
    print("Del 0 al 10 de 2 en 2")
    for (i in 0..10 step 2) {
        print("$i ")
    }
    println("\n")

    print("Del 0 al 10 de 3 en 3")
    for (i in 0..10 step 3) {
        print("$i ")
    }
    println("\n")

    print("Del 20 al 0 de 2 en 2:")
    for (i in 20 downTo 0 step 2) {
        print("$i ")
    }
    println("\n")

    print("Números pares del 1 al20:")
    for (i in 2..20 step 2) {
        print("$i ")
    }
    println("\n")

    print("Números impares del 1 al 20: ")
    for (i in 1..20 step 2) {
        print("$i ")
    }
    println("\n")

    println("Ejercicio: Cuenta regresiva")
    for (i in 10 downTo 0) {
        print("$i ")
        Thread.sleep(200)
    }

    println("\n")

    print("Multiplos de: ")
    val multiplo = readLine()?.toIntOrNull() ?: 5
    print("Hasta: ")
    val hasta = readLine()?.toIntOrNull() ?: 50

    print("\nMultiplos de $multiplo hasta $hasta: ")
    for (i in multiplo..hasta step multiplo) {
        print("$i ")
    }
    println("\n")
}
