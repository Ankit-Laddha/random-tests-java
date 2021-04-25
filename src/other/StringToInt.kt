import java.util.*
import kotlin.math.pow

fun main() {
  /*  val bo = stringToIntRec("4321")
    println("ANSWER: $bo")*/
    stack()
    queue()
}

fun stack(){
    val st: Stack<String> = Stack()
    st.push("a")
    st.push("b")
    st.push("c")
    println(st)
    st.pop()
    st.pop()
    println(st)
}

fun queue(){
    val qu: Queue<String> = PriorityQueue<String>()
    qu.add("d")
    qu.add("e")
    qu.add("f")
    println(qu)
    qu.remove()
    println(qu)
    qu.remove()
    println(qu)

}
fun stringToInt(input: String): Int {
    //4321

    var len: Int = input.length - 1
    var num: Long = 0
    for (i in input.toCharArray()) {
        num += Integer.parseInt(i.toString()) * 10.toDouble().pow(len.toDouble()).toLong()
        len--;
    }

    return num.toInt()
}

fun stringToIntRec(input: String) = stringToIntRec(input, input.length)

private fun stringToIntRec(input: String, len: Int): Int {

    if(len == 1)
        return Integer.parseInt(input)
    return (Integer.parseInt(input[0].toString()) * 10.toDouble().pow(len.toDouble()-1).toLong() + stringToIntRec(input.substring(1,len), len - 1 )).toInt()
}