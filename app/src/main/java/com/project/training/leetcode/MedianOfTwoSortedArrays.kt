package com.project.training.leetcode

import kotlin.math.*

object MedianOfTwoSortedArrays {
    interface ArraysSortProcessor {
        fun initIndices()
    }
    fun findMedianSortedArrays(left: IntArray, right: IntArray): Double {
        if (left.isEmpty() && right.isEmpty()) return 0.0
        if (left.isEmpty()) return getMedian(right)
        if (right.isEmpty()) return getMedian(left)
        val length = left.size + right.size
        val processor = ArraysSortProcessor(left, right)
        processor.initIndices()
        val halfLength = ceil(length / 2.0).toInt()
        var rightIndex = min((halfLength / 2) - 1, right.lastIndex)
        var leftIndex = min((halfLength - 2) - rightIndex, left.lastIndex)
        var temp: Int
        /*test code*/ var iteration = 0
        while (true) {
            if (rightIndex >= 0 && left.lastIndex != leftIndex && left[leftIndex + 1] < right[rightIndex]) {
                temp = leftIndex
                leftIndex += ceil(((halfLength - 1) - leftIndex) / 2.0).toInt()
                rightIndex -= leftIndex - temp
            } else if (leftIndex >= 0 && right.lastIndex != rightIndex && right[rightIndex + 1] < left[leftIndex]) {
                temp = rightIndex
                rightIndex += ceil(((halfLength - 1) - rightIndex) / 2.0).toInt()
                leftIndex -= rightIndex - temp
            } else break
            /*test code*/if (++iteration == left.size + right.size) throw IllegalStateException()
        }
        return if (length.isEven()) {
            when {
                rightIndex < 0 -> (left[leftIndex] + min(right.first(), left.getOrNull(leftIndex + 1) ?: right.first())) / 2.0
                leftIndex < 0 -> (right[rightIndex] + min(left.last(), right.getOrNull(rightIndex + 1) ?: left.first())) / 2.0
                left[leftIndex] < right[rightIndex] -> (right[rightIndex] + min((left.getOrNull(leftIndex + 1) ?: right[rightIndex + 1]), right.getOrNull(rightIndex + 1) ?: left.last())) / 2.0
                else -> (left[leftIndex] + min(left.getOrNull(leftIndex + 1) ?: right[rightIndex + 1], right.getOrNull(rightIndex + 1) ?: left[leftIndex + 1])) / 2.0
            }
        } else {
            when {
                rightIndex < 0 -> left[leftIndex] * 1.0
                leftIndex < 0 -> right[rightIndex] * 1.0
                left[leftIndex] < right[rightIndex] -> right[rightIndex] * 1.0
                else -> left[leftIndex] * 1.0
            }
        }
    }

    fun getMedian(array: IntArray): Double {
        return if (array.size % 2 == 1) array[array.size / 2] * 1.0
        else (array[array.size / 2] + array[array.size / 2 - 1]) / 2.0
    }

    fun Int.isOdd() = this % 2 == 1
    fun Int.isEven() = this % 2 == 0

    fun ArraysSortProcessor(left: IntArray, right: IntArray): ArraysSortProcessor =
        if ((left.size + right.size) % 2 == 1) OddArraysSortProcessor(left, right)
        else EvenArraysSortProcessor(left, right)

    class EvenArraysSortProcessor(val left: IntArray, val right: IntArray) : ArraysSortProcessor{
        override fun initIndices() {
            TODO("Not yet implemented")
        }
    }
    class OddArraysSortProcessor(val left: IntArray, val right: IntArray) : ArraysSortProcessor{
        override fun initIndices() {
            TODO("Not yet implemented")
        }
    }
}
