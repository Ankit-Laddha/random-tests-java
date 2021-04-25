
import java.util.HashMap


fun twoSum(nums: IntArray, target: Int): IntArray {
    val a = nums[0]
    if (target < a)
        return emptyArray<Int>().toIntArray()
    val answer = intArrayOf()
    for (i in nums.indices){
        for (j in (i+1) until nums.size) {
            if(nums[i] + nums[j] == target)
                return answer.plus(i).plus(j)
        }
    }
    return answer
}

fun findTwoSum(nums: IntArray, target: Int): IntArray? {
    val numMap: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (numMap.containsKey(complement)) {
            return intArrayOf(numMap[complement]!!, i)
        } else {
            numMap[nums[i]] = i
        }
    }
    return intArrayOf()
}

fun main() {
    val arr: Array<Int> = arrayOf(2,7,11,15)
    val target = 9
    val ans = findTwoSum(arr.toIntArray().sortedArray(), target)
    println("ANS: ${ans?.asList()}")
}