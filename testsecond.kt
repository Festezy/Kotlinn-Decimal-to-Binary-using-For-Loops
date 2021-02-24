fun main() {
    var dec = 0
    val bin = "101101"
    var x = 0

    for(i in bin.length downTo 1 step 1){
        dec = dec + (bin.get(x).toString().toInt() * Math.pow(2.0,i.toDouble()-1).toInt())
        println("${bin.get(x).toString().toInt()} * ${Math.pow(2.0,i.toDouble()-1).toInt()} = " +
                "${bin.get(x).toString().toInt()} * ${Math.pow(2.0,i.toDouble()-1).toInt()}")
        x++
    }

    println("The Decimal from Binary $bin is $dec")
}
