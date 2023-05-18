import java.util.*

fun main() {

    val tax: Double = 0.0075
    var amount: Int = 0
    var sumTax = 0

    println("Ведите сумму перевода")

    val scan = Scanner(System.`in`)

    amount = scan.nextLine().toInt()

    sumTax = ((amount * tax).toInt())

    if (sumTax < 35) sumTax = 35

    println(sumTax)
}


