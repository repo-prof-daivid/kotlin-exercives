import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 0..10){
        println("$i * $n = ${i*n}")
    }
}