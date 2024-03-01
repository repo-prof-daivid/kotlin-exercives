open class Animal(
    var nome: String? = null,
    var idade: Int? = null,
    var raca: String? = null,
    var sexo: Char? = null
){
    fun fizAniversario() {
        idade?.let {
            idade = idade!! + 1
        } ?: run {
            println("Idade n definida!!")
        }
    }

    fun apresentacao(mensagemI: String = "", mensagemF: String = "") {
        println(mensagemI)
        println("Olá eu sou $nome!")
        println("Eu tenho $idade anos de Idade!")
        println("E sou um $raca!")
        println(mensagemF)
    }
}