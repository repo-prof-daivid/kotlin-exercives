import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var exit: String = ""
    var mediaAr = 0.0
    var qtdP = 0.0
    var qtdN = 0.0
    var soma = 0.0
    while (exit.uppercase(Locale.getDefault()) != "S") {
        println("Digite um n: ")
        val n = sc.nextDouble()
        soma += n
        if (n >= 0) {
            qtdP++
        } else {
            qtdN++
        }
        println("quer encerrar o programa? se sim (S) se nao (N)")
        exit = sc.next()
    }

    mediaAr = soma / (qtdN + qtdP)
    val percentP: Double = qtdP / (qtdP + qtdN)
    val percentN: Double = qtdN / (qtdP + qtdN)
    println("A media aritimetica é :$mediaAr")
    println("A qtd n positivos :$qtdP")
    println("A qtd n negativos :$qtdN")
    println("O percentual de n positivos:$percentP")
    println("O percentual de n negativos:$percentN")
}