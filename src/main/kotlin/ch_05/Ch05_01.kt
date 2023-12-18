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
//    list.stream().filter() 한번에 연산해서 더 효율적임
//    list.filterNot {  } 필터 제외
//    list.filterNotNull {  } 필터 널이 아닌것만
//    list.filter {
        // 람다 안에 람다를 쓸때 헷갈리지 않기 위해 별칭을 붙혀 사용
//        it.let { el ->
//            el
//        }
//    }

    //with, apply
    val alphabet: String = with(StringBuilder()) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        this.toString() // this 넌 누구냐?.. 펑션이 아니자나
    }

    println(alphabet)

    val sb = StringBuilder()
    val alphabet2: String = sb.apply {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
    }.toString()
    println(alphabet2)

    val id: String? = "doo"
    val email = id?.let {
        "${it}@gmail.com"
    } ?: "unknown"
    println(email)

}

fun fun1(value: String, fun2: (String) -> Unit): Unit {
    fun2(value)
}