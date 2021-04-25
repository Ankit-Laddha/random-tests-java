import java.util.*

fun main() {
    val answer = groupAnagram()
    println("Final: ${answer}")
}

fun groupAnagram() : List<List<String>>{
    val strs = arrayOf("eat","tea","tan","ate","nat","bat")
    //val strs = emptyArray<String>()
    val answer = mutableMapOf<String,MutableList<String>>()
    // 0(n)
    for (str in strs){
        val charArray = str.toCharArray()
        charArray.sort()
        val sortedStr : String = String(charArray)
        println("ABC: sortedStr : $sortedStr")
        if (answer.containsKey(sortedStr))
            answer[sortedStr]!!.add(str)
        else
            answer[sortedStr] = mutableListOf(str)
    }

    return answer.values.toList()
}