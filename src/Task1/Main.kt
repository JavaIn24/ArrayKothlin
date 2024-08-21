package Task1

fun main (){
    var array = arrayOf(1.2,2.3,3.4,4.5,5.6,6.6,7.6,8.6,9.9,10.1)
    var c = 1.0
    for (i in array){
        c *= i
    }
    println(c.toInt())
}