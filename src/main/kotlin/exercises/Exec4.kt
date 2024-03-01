import java.util.*

fun main() {
    var i0_25 = 0
    var i26_50 = 0
    var i51_75 = 0
    var i76_100 = 0
    var n: Int
    val sc = Scanner(System.`in`)
    do {
        println("Digite um número entre 0 e 100: ")
        n = sc.nextInt()
        if (n in 0..25) {
            i0_25++
        } else if (n in 26..50) {
            i26_50++
        } else if (n in 51..75) {
            i51_75++
        } else if (n in 76..100) {
            i76_100++
        } else if (n > 100) {
            println("O número deve estar entre 0 e 100!")
        }
    } while (n >= 0)

    println("0 - 25: $i0_25 --- 26 - 50: $i26_50 --- 51 - 75: $i51_75 --- 76 - 100: $i76_100")
}