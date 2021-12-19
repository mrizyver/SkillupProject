package com.project.training.leetcode

import kotlin.math.abs

object Sum3Closest {
    fun threeSumClosest(arr: IntArray, target: Int): Int {
        arr.sort()
        var i = -1
        var closest: Int? = null
        while (++i < arr.size - 2) {
            if (i > 0 && arr[i] == arr[i - 1]) continue
            var l = i + 1
            var r = arr.lastIndex
            loop@while (l < r) {
                val sum = arr[i] + arr[l] + arr[r]
                if (closest == null) closest = sum
                else if (abs(target - sum) < abs(target - closest)) closest = sum
                when {
                    sum < target -> l++
                    sum > target -> r--
                    else -> break@loop
                }
            }
        }
        return closest!!
    }
}