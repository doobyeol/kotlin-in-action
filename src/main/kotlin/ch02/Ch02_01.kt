package ch02

import java.lang.Exception

fun main(args: Array<String>) {
    println("hello, world")

    // value : const / final
    val name: String = "두벼리"
    // name = "한벼리"

    var name2: String = "두벼리"
    name2 = "한벼리"

    // 타입 생략 쌉가능, 메소드 호출시 어떤 타입을 리턴하는지 힌트성으로 표기하기도 함
    var name3 = "두벼리"
    name3 = "한벼리"

    var name4 = "my name is ${name.uppercase()} 입니다"

    val person = Person("두벼리", null, setOf(Skill.JAVA, Skill.KOTLIN))
    println(person.name)
    println(person.age)

    val name5 = getEnName(name);

    val ageText = when {
        person.age!! < 10 -> "응애"
        person.age < 20 -> "ㅎㅇ"
//        person.name == "두벼리" -> 100 // 이러면 컴파일 했을때 Object 만듬. 안좋은 코드
        else -> "안녕하세요"
    }


    // 스마트 캐스트
    val a: Any = ""

    if (a is String) {
        a.uppercase()
    } else if (a is Int) {
        a.minus(1)
    }

    val size = 1..10
    for (i in size) {
        println("i : $i")
    }

    val tryResult = try {
        throw Exception("")
        0
    } catch (e: Exception) {
        1
    } finally {
        println("finally")
        2
    }

    println("tryResult: $tryResult") // 1
}

class Person(val name: String, val age: Int?, val skill: Set<Skill>) {
    private var _koreaAge: Int = 1
    val koreaAge: Int
        get () {
//            return _koreaAge -1
            return age?.minus(1) ?: 0
        }
//        set (value) {
//            _koreaAge = value
//        }
}

fun getName(): String = "두벼리"
fun getEnName(name: String): String {
    return when (name) {
        "두벼리", "Doobyeol" -> "Doobyeol"
        else -> "Who are you?"
    }
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

enum class Skill(val level: Int) {
    JAVA(1),
    KOTLIN(2),
    TYPE_SCRIPT(3), // 컴마 쓸 수 있음
}