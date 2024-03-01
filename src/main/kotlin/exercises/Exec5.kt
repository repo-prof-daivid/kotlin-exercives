import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var nP = 0
    var nI = 0
    var somaP = 0
    var somaI = 0
    do {
        println("Digite um número (Caso queira encerrar o programa digite 0): ")
        val n: Int = sc.nextInt()
        if (n>0){
            if (n % 2 == 0) {
                nP++
                somaP += n
            } else {
                nI++
                somaI += n
            }
        }
    } while (n != 0)

    println("Qtd nP: $nP")
    println("Qtd nI: $nI")
    if (nP > 0) {
        println("Média nP: ${somaP / nP}")
    } else {
        println("Você não digitou nenhum número par!")
    }
    if ((nP + nI) > 0 ){
        println("Média total: ${(somaP + somaI) / (nP + nI)}")
    }else {
        println("Você não digitou nenhum número!")
    }
}