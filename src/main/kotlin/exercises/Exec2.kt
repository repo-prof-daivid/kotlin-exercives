fun main() {
    var maior = Double.MIN_VALUE
    var menor = Double.MAX_VALUE

    for (i in 1..5){
        val altura = readLine()?.toDouble()
        altura?.let {
            if (altura > maior) {
                maior = altura
            }
            if (altura < menor){
                menor = altura
            }
        }
    }

    println("A maior altura é $maior")
    println("A menor altura é $menor")
}