fun main(){
    var bin = "1011011"
    var dec = 0

    println("Bin : $bin")

    var lastIndex = bin.lastIndex


    for(i in 0..lastIndex){
        dec += Math.pow(2.0, i.toDouble()).toInt() *
                bin[lastIndex - i].toString().toInt()
    }

    println("Dec : $dec")


//    Not Finish yet use Top ^
//    println(dec)
//    do {
//        bin = "${dec % 2}$bin"
//        dec = Math.floor((dec / 2).toDouble()).toInt()
//    } while (dec > 0)



//    for ((i, v) in  bin.withIndex()){
//        println(i)
//    }


}
