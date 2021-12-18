package com.project.training.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class Sum2Test {
    @Test
    fun `test 2,7,11,15`() {
        assertArrayEquals(intArrayOf(0, 1), TwoPointersSum2.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}