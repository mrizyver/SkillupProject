package com.project.training.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.random.Random

class ContainerWithMostWaterInefficientAlgorithmTest {
    @Test
    fun `test 1,8,6,2,5,4,8,3,7`() {
        val heights = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        assertEquals(49, ContainerWithMostWaterInefficientAlgorithm.maxArea(heights))
        assertEquals(49, ContainerWithMostWaterEfficientAlgorithm.maxArea(heights))
    }
}
