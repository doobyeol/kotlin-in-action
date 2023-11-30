package ch03

import test.joinToString

fun main(args: Array<String>) {
    val set = hashSetOf(1, 6, 3)
    val map = hashMapOf(1 to "A", 2 to "B")
    val list = arrayListOf(1, 2, 3, 4, 5)

    map.put(3, "C")
    list.add(6)

    // 불변을 위해서 listOf 사용
    val list2 = listOf(1, 2, 3, 4, 5)
//    list2.add(1);

    val map2 = mapOf(1 to "A", 2 to "B")
//    map2.put()

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    list3.add(1)

//    list3.stream()
//        .map()
//        .filter()
//        .toList()

//    val result = joinToString(list, ",", "(", ")")
    val result = list.joinToString(postFix = ")", separator = "/", prefix = "(")
    println(result) // (1, 2, 3, 4, 5, 6)

    val person = Person("doo")
    person.getName() // 내부 함수가 있으면 확장 함수가 호출되지 않고 내부 함수가 동작

    var str = "doo" myPlus "123"
}

// 중위 함수
// 확장 함수에만 쓸수 있다
// 파라미터는 하나
infix fun String.myPlus(pther: String): String {
    return this + pther
}

class Person(val name: String) {
    //내부 함수
    fun getName(): String {
        return this.name
    }
}

// 확장함수 클래스명.함수명
fun Person.getName(): String {
    return this.name
}