import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    val R = sc.nextInt()
    var result = A
    println(result)
    for (i in 1..9){
        result *= R
        println(result)
    }
}