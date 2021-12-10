package com.project.training.book

/**
 * Sorting algorithm that takes input number in range from 0 to k
 * Running time: O(n) + O(k)
 * Memory consuming: O(k)
 */
object CountingSort {
    fun sort(input: IntArray, output: IntArray, k: Int): IntArray {
        val buffer = IntArray(k + 1)
        for (i in input.indices) buffer[input[i]]++
        for (i in 1..buffer.lastIndex) buffer[i] += buffer[i - 1]
        for (i in input.lastIndex downTo 0) output[--buffer[input[i]]] = input[i]
        return output
    }
}