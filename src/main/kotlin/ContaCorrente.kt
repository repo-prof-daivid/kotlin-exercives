class ContaCorrente(
    private val numero: Int,
    private var saldo: Double
) {

    fun creditar(valor: Double){
        this.saldo += valor
    }

    fun debitar(valor: Double){
        if ((this.saldo - valor) < 0 ){
            println("Saldo insuficiente!")
        } else {
            this.saldo -= valor
        }
    }

    fun imprimi(){
        println("O número da conta é: $numero e seu saldo é de: $saldo")
    }
}

fun main() {
    val cc = ContaCorrente(
        1,
        10000.0
    )

    cc.imprimi()
    cc.creditar(1.0)
    cc.imprimi()
    cc.debitar(10000.0)
    cc.imprimi()
}