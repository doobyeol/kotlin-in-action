package ch_05

fun main() {
    val doo = "doo"
//    fun1(doo, { name:String -> println(name) })
//    fun1(doo) { name:String -> println(name) }
    // it을 사용하여 파라미터 생략 가능
    fun1(doo) { println(it) }

    val list = listOf(1,2,3)
//    list.filter { a -> a == 1 }
    list.filter { it == 1 }
    list.filter { el -> el == 1 }
//    list.filter {
        // 람다 안에 람다를 쓸때 헷갈리지 않기 위해 별칭을 붙혀 사용
//        it.let { el ->
//            el
//        }
//    }
}

fun fun1(value: String, fun2: (String) -> Unit): Unit {
    fun2(value)
}