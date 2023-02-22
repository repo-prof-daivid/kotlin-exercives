import java.util.*

/**
 * Escreva um algoritmo que
 * leia um valor inicial A e imprima a sequência
 * de valores do cálculo de A! e o seu resultado.
 * Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
 */

fun main() {
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    var result = A
    print("$A! = $A x ")
    for (i in A-1 downTo 2){
        print("$i x ")
        result*=i
    }
    print("1 = $result")
}