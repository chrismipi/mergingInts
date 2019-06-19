package main

fun main() {
    val a: List<Int> = listOf(1,4,5,7)
    val b: List<Int> = listOf(3,4,8,10,11)

    val result: List<Int> = mergeInt(a, b)
    for(item in result) {
       print("$item ")
    }
}

fun mergeInt(a: List<Int>, b: List<Int>): List<Int> {
    var aC = 0
    var bC = 0
    val aSize = a.size
    val bSize = b.size

    var done = false
    val list: MutableList<Int> = mutableListOf()
    while (!done) {
        when {
            aC == aSize -> {
                for (i in bC until bSize) {
                    list.add(b[i])
                }
                done = true
            }
            bC == bSize -> {
                for (i in aC until aSize) {
                    list.add(a[i])
                }
                done = true
            }
            a[aC] < b[bC] -> {
                list.add(a[aC])
                aC++
            }
            else -> {
                list.add(b[bC])
                bC++
            }
        }
    }
    return list
}