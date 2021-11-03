package com.project.training.leetcode

import kotlin.math.*

object MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(left: IntArray, right: IntArray): Double {
        val length = left.size + right.size
        val halfLength = length / 2
        var leftIndex = min(halfLength, left.lastIndex)
        var rightIndex = max(halfLength - leftIndex - 1, 0)
        while (true) {
            if (left[leftIndex] <= right[rightIndex]) {
                if (left[min(leftIndex + 1, left.lastIndex)] <= right[rightIndex]) break
                if (right[min(rightIndex + 1, right.lastIndex)] >= left[leftIndex]) break
            }

            if (left[leftIndex] > right[rightIndex]) {
                leftIndex /= 2
                rightIndex = halfLength - leftIndex - 1
            }
        }
        return if (length % 2 == 0) (left[leftIndex] + right[rightIndex]) / 2.0
        else right[rightIndex].toDouble()
    }
}
