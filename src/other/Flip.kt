fun main() {

    val a = arrayOf(1, 0, 1, 1, 1)
    val n = 4
    flip(a, n)
}

fun flip(a: Array<Int>, n: Int) {
    val LEFT = 0
    val RIGHT = 0
    var temp = a.copyOf()
    var ans = a.copyOf()
    for (j in 0 until n) {
        for (i in ans.indices) {
            when (i) {
                0 -> temp[i] = match(LEFT, ans[i + 1])
                ans.size - 1 -> temp[i] = match(ans[i - 1], RIGHT)
                else -> temp[i] = match(ans[i - 1], ans[i + 1])
            }
        }
        ans = temp.copyOf()
        println("Inter Ans: ${ans.toList()}")
    }

    println("Ans: ${ans.toList()}")
}

fun match(left: Int, right: Int): Int {
    if (right == left)
        return 1
    return 0
}
