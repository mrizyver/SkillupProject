@file:Suppress("ControlFlowWithEmptyBody")

package com.project.training.leetcode

import java.util.*
import kotlin.collections.HashSet

object InefficientSum3 {
    fun threeSum(arr: IntArray): List<List<Int>> {
        val result = HashSet<List<Int>>()
        arr.sort()
        for (i1 in 0 until arr.size) {
            for (i2 in i1 + 1 until arr.size) {
                val i3 = arr.binarySearch(-(arr[i1] + arr[i2]), i2 + 1)
                if (i3 > -1) result.add(listOf(arr[i1], arr[i2], arr[i3]))
            }
        }
        return result.toList()
    }
}

object EfficientSum3 {
    fun threeSum(arr: IntArray): List<List<Int>> {
        val result = LinkedList<List<Int>>()
        arr.sort()
        var i = -1
        while (++i < arr.size - 2) {
            if (i > 0 && arr[i] == arr[i - 1]) continue
            var l = i + 1
            var r = arr.lastIndex
            while (l < r) {
                val sum = arr[i] + arr[l] + arr[r]
                when {
                    sum < 0 -> l++
                    sum > 0 -> r--
                    else -> {
                        result.add(listOf(arr[i], arr[l], arr[r]))
                        while (l < r && arr[l++] == arr[l]);
                        while (l < r && arr[r--] == arr[r]);
                    }
                }
            }
        }
        return result
    }
}