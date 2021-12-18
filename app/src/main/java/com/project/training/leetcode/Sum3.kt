package com.project.training.leetcode

import kotlin.collections.HashSet

object SquaredSum3 {
    fun threeSum(arr: IntArray): List<List<Int>> {
        val result = HashSet<List<Int>>()
        arr.sort()
        for (i1 in 0 until arr.size){
            for (i2 in i1 + 1 until arr.size) {
                val i3 = arr.binarySearch(-(arr[i1] + arr[i2]), i2 + 1)
                if (i3 > -1) result.add(listOf(arr[i1], arr[i2], arr[i3]))
            }
        }
        return result.toList()
    }
}