package ch_04

fun main() {
    val person = Person2()
    println(person.name)

    person.name = "test"
    println(person.name)

    person.age = 20
    println(person.age)

    val myMap = MyMap(mutableMapOf())
    println(myMap.test())
    myMap.put("TEST", "test")
    println(myMap.get("TEST"))
    Person4.Doo.companionFun()
    Person4.A
    val person4 = Person4.from()

}

class Person4 {

    private constructor(name: String) {

    }

    companion object Doo{ // 동반객체
        const val A = "A"
        fun companionFun() {
            println("companionFun()")
        }
        fun from(): Person4 {
            return Person4("doo")
        }
    }
}

// field = this 같은 개념
class Person2 {
    var name: String = "doo"
        set (value: String) {
            println("field = $field, value = $value")
            field = value
        }
    var age: Int = 0
        set (value: Int) {
            println("field = $field, value = $value")
            field = value
        }
}

// 싱글톤 오브젝트
object Singleton {
    fun myFun() {
        println("myFun!")
    }
}

// 기본적으로 생성자가 있음
class Person3 (val name: String)

//class Person2 {
//    constructor(name: String)
//}

//class Person2 constructor(val _name: String) {
//    val name: String = _name
////    init {
////        name = _name
////    }
//}

// class 위임 Wrapping
class MyMap(val map:MutableMap<String, String>): MutableMap<String, String> by map {

    override fun get(key: String): String? {
        println(" CUSTOM GET ! ")
        return map.get(key)
    }

    fun test():String {
        return "TEST"
    }
}

//    fun put(key:String, value:String) {
//        map.put(key, value)
//    }
//
//    fun get(key:String): String {
//        return map.get(key)
//    }
//} by Map

