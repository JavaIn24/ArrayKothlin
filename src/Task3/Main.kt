package Task3
fun main (){
    var iter = 0 // Переменная для подсчета количества итерации
    var array = Array<Int>(10){a -> a + 1 }
    for (i in array){
        if (i % 2 == 0){
            iter += 1
            println(i)

        }
    }
    println("Количество четных элементов " +
            "в исходном массиве равно $iter")
