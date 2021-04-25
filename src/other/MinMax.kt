import kotlin.math.max
import kotlin.math.min

fun main() {
    minMax()
}

fun minMax() {
    val arr = arrayOf(2,5,3,4,1,6)
 /*   arr.sort()
    val min = arr[0]
    println("MIN : $min")
    val max = arr[arr.size-1]
    println("MAX : $max")*/

    val min = findMin(arr)
    println("MIN : $min")

    val max = findMax(arr)
    println("MIN : $min")
}

fun findMin(arr: Array<Int>): Int {
    if(arr.size == 1)
        return arr[0]
    return min(arr.first(), findMin(arr.copyOfRange(1, arr.size)))
}

fun findMax(arr: Array<Int>): Int {
    if(arr.size == 1)
        return arr[0]
    return max(arr.first(), findMax(arr.copyOfRange(1, arr.size)))
}
