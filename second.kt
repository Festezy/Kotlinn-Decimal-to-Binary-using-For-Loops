import kotlin.math.pow

fun main() {
    var dec = 0
    val bin = "101101"


    // using kotlin feature in it
    
    for((x, i) in (bin.length downTo 1 step 1).withIndex()){
        dec += (bin[x].toString().toInt() * 2.0.pow(i.toDouble() - 1).toInt())
        println("${bin[x].toString().toInt()} * ${2.0.pow(i.toDouble() - 1).toInt()} = " +
                "${bin[x].toString().toInt()} * ${2.0.pow(i.toDouble() - 1).toInt()}")
    }

    println("The Decimal from Binary $bin is $dec")
}
