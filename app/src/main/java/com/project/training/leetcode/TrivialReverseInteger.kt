package com.project.training.leetcode

import java.util.*
import kotlin.math.abs
import kotlin.math.pow

object TrivialReverseInteger {
    fun reverse(x: Int): Int {
        val sign = if (x < 0) -1 else 1
        var input = x
        val list = LinkedList<Int>()
        while (input != 0) {
            list.add(abs(input % 10))
            input /= 10
        }
        var output: Long = 0
        list.forEachIndexed { index, i ->
            output += i * 10.0.pow(list.lastIndex - index).toLong()
        }
        if (abs(output) > Int.MAX_VALUE) return 0
        return (sign * output).toInt()
    }
}