fun main() {
    val arr = arrayOf(1, 3, 4, 5)

    val total = (arr.size+1)*(arr.size+2)/2
    var sum = 0
    for (i in arr)
        sum+=i
    println(total-sum)
}

