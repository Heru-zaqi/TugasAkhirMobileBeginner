package Soal_2

fun main() {
    val n = 5
    println("plugin($n)")
    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("plugin")
            i % 3 == 0 -> println("plug")
            i % 5 == 0 -> println("in")
            else -> println(i)
        }
    }
}
