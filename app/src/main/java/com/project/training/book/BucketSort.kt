package com.project.training.book

import java.util.*
import kotlin.math.floor

/**
 * Sorting algorithm that assumes that:
 *      - the inputs in in range from 0 to 1
 *      - the input is uniformly distributed
 * Average running time: O(n)
 * Memory consuming: O(n)
 */
object FloatBucketSort {
    fun sort(input: FloatArray): FloatArray {
        val buckets = Array<LinkedList<Float>>(input.size) { LinkedList() }
        for (i in input.indices) buckets[floor(input[i] * input.lastIndex).toInt()].add(input[i])
        var index = 0
        for (bucket in buckets) {
            bucket.sort()
            for (f in bucket) input[index++] = f
        }
        return input
    }
}

object IntBucketSort {
    fun sort(input: IntArray, maxNum: Int): IntArray {
        val buckets = Array<LinkedList<Int>>(input.size) { LinkedList() }
        for (i in input.indices) buckets[floor(input[i].toFloat() / maxNum * input.lastIndex).toInt()].add(input[i])
        var index = 0
        for (bucket in buckets) {
            bucket.sort()
            for (f in bucket) input[index++] = f
        }
        return input
    }
}
