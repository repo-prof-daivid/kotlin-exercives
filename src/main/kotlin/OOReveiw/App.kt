class App {
    companion object {
        fun runApplication() {
            val noel = Cachorro(
                nome = "Ajudante de Papai Noel",
                idade = 8,
                raca = "Galgo Inglês",
                sexo = 'M'
            )
            val scooby = Cachorro(
                nome = "Scooby-doo",
                idade = 7,
                raca = "Dogue Alemão",
                sexo = 'M'
            )
            val gato = Gato()

            noel.apresentacao(
                mensagemI = "Bom dia!",
                mensagemF = "Quem é você?"
            )
            scooby.apresentacao(
                mensagemI = "Bom dia não, boa tarde, você não viu a hora?"
            )

            gato.miar()
            gato.nome = "Felino"
            gato.idade = 12
            gato.raca = "Amarelo"
            gato.sexo = 'M'
            gato.apresentacao()


        }
    }
}

fun main() {
    App.runApplication()
}