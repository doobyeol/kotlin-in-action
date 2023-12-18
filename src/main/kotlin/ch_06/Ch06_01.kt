package ch_06

fun main() {
    val name: String? = null;
//    val name2: String = null!! ???
    val result = name?.substring(0, 3) ?: ""

    if (name.equals("TEST")) { // null.equals
//    if (name?.equals("") ?: false) { 이거는 null 자체
        println("TEST")
    }

//    name!!.equals("")

    val result2 = name.let {
        it + "빵"
    }

    println(result2)
}
