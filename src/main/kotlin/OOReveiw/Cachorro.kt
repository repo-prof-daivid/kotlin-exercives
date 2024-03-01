class Cachorro(
    nome: String?,
    idade: Int?,
    raca: String?,
    sexo: Char?
): Animal(nome, idade, raca, sexo) {

    fun latir() {
        println("Au au!")
    }
}