package ch_04

fun main(args: Array<String>) {

    val developer = Developer()
    println("name : ${developer.name}")
    developer.doCoding()
    developer.pray()
    developer.doError()

}

//open class Person(val name: String)
abstract class Person(val name: String) {
    abstract fun getMyName(): String

    open fun walk() {
        println("Person 걷는 중...")
    }
}

open class Developer: Person("두벼리"), Codable, Prayerable {
//sealed class Developer: Person("두벼리"), Codable, Prayerable {

    override fun doCoding() {
        println("코딩중 ...")
    }

    override fun pray() {
        println("기도 메타하는 중 ...")
    }

    override fun getMyName(): String {
        return super.name
    }

    override fun doError() {
        println("Developer Error")
    }
    override fun walk() {
        println("Developer walk")
    }
}

interface Codable {
    fun doCoding()
    fun doError() {
        println("Codaable Error")
    }
}

interface Prayerable {
    fun pray()
}

class FrontDeveloper: Developer() {

}

class BackendDeveloper: Developer() {

}

fun doSomething(developer: Developer) {
    when (developer) {
        is FrontDeveloper -> println("~ 2022")
        is BackendDeveloper -> println("2023 ~")
        else -> throw RuntimeException("??")
    }
}