package other

class LongestCommonPrefix {

}

fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    val s1 = ns?.run {                                                  // 1
        println("\tis empty? " + isEmpty())                    // 2
        println("\tlength = $length")
        length                                                 // 3
    }
    val s2= ns?.let {
        it.isEmpty()
    }
    val s3 = ns?.apply {
        isEmpty()
    }

    val s4 = ns?.also {
        it.isEmpty()
    }

    val s5 = with(ns){
        this?.isEmpty()
    }

}

fun isBalanced(s: String): Pair<Boolean,StringBuilder>{
    var cond = true
    var str = StringBuilder(s)
    while (cond){
        when {
            str.contains("()") -> str = StringBuilder(str.toString().replace("()",""))
            str.contains("[]") -> str = StringBuilder(str.toString().replace("[]",""))
            str.contains("{}") -> str = StringBuilder(str.toString().replace("{}",""))
            else -> cond= false
        }
    }
    return Pair(str.isEmpty(), str)
}

fun main(args: Array<String>) {
    /*val s = arrayOf("card", "care", "caddd")
    val answer = other.LongestCommonPrefixJava.longestCommonPrefixNew(s)
    println("answer = $answer")*/


    val arr = arrayOf(4,2,3,1)
    println(arr.sortedArray().toList())

    println("bal: ${isBalanced("[([{}])]")}")
}