fun areAnagram(s1: String, s2: String): Boolean {

    if (s1.isNullOrBlank() || s2.isNullOrBlank() || s1.length != s2.length)
        return false

    val s1Lower = s1.toLowerCase()
    val s2Lower = s2.toLowerCase()
    val s1Map = mutableMapOf<Char, Int>()
    val s2Map = mutableMapOf<Char, Int>()

    for (i in s1Lower.indices) {
        if (s1Map.containsKey(s1Lower[i]))
            s1Map[s1Lower[i]] = s1Map[s1Lower[i]]!! + 1
        else
            s1Map[s1Lower[i]] = 1

        if (s2Map.containsKey(s2Lower[i]))
            s2Map[s2Lower[i]] = s2Map[s2Lower[i]]!! + 1
        else
            s2Map[s2Lower[i]] = 1
    }

    for (i in s1Map.keys)
        if(s1Map[i] != s2Map[i])
            return false

    return true
}

fun main() {
    val bo = areAnagram("Aarm", "Army")
    println("ANSWER: $bo")
}


