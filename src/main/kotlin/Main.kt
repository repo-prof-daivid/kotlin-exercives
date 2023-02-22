fun main(args: Array<String>) {
    val alturas = arrayListOf<Double>()
    for (i in 1..5){
        val altura = readLine()?.toDouble()
        altura?.let {
            alturas.add(it)
        } ?: run { alturas.add(1.8) }
    }
    println("A maior altura é ${alturas.max()}")
    println("A menor altura é ${alturas.min()}")
}