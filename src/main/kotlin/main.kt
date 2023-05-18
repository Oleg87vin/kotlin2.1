fun main() {

    val tax: Double = 0.0075
    val amount: Int = 10_000
    var sumTax = 0


    sumTax = ((amount * tax).toInt())

    if (sumTax < 35) sumTax = 35

    println(sumTax)

}


