package test

import java.lang.StringBuilder

fun List<Any>.joinToString(
     separator: String = ",",
     prefix:String = "(",
     postFix:String = ")"): String {

    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postFix)
    return result.toString()

}