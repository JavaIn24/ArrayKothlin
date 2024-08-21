package Task4
fun main () {
    val n = 10
    val array = IntArray(n)
    array[0] = 2
    for (i in 1..<n) {
        array[i] = array[i - 1] * 2
    }
    println(array.contentToString())
}
