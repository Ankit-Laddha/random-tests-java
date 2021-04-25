fun main() {
    findLongestSubString("iloveindia")
}

fun findLongestSubString(str: String) {
    var maxLength = 1
    var index = 0

    var start=0
    var end=0

    var sub = StringBuffer("")

    val s = str.toCharArray()
    for (i in 1 until s.size) {
        if (!sub.contains(s[i])) {
            end++
            index++
            sub.append(s[i])
        } else {
            val ind = sub.indexOfFirst { it == s[i] }
            sub = StringBuffer(sub.subSequence(ind + 1, s.size))
            index = sub.length


        }

    }
}