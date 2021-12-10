package com.project.training.leetcode

import kotlin.math.*

object ContainerWithMostWaterInefficientAlgorithm {
    fun maxArea(heights: IntArray): Int {
        var max = 0
        for (l in 0..heights.lastIndex) {
            for (r in l..heights.lastIndex){
                val volume = (r - l) * min(heights[l], heights[r])
                max = max(max, volume)
            }
        }
        return max
    }
}

object ContainerWithMostWaterEfficientAlgorithm {
    fun maxArea(heights: IntArray): Int {
        var max = 0
        var l = 0
        var r = heights.lastIndex
        while (l < r) {
            max = max((r - l) * min(heights[r], heights[l]), max)
            if (heights[l] < heights[r]) l++ else r--
        }
        return max
    }
}