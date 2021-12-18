package com.project.training.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class Sum3Test {
    @Test
    fun `test -1,0,1,2,-1,-4`() {
        assertArrayEquals(
            arrayOf(
                intArrayOf(-1, -1, 2),
                intArrayOf(-1, 0, 1)
            ), InefficientSum3.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
                .map { it.toIntArray() }.toTypedArray()
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(-1, -1, 2),
                intArrayOf(-1, 0, 1)
            ), EfficientSum3.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
                .map { it.toIntArray() }.toTypedArray()
        )
    }

    @Test
    fun `test 0,0,0`() {
        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
            ), InefficientSum3.threeSum(intArrayOf(0, 0, 0))
                .map { it.toIntArray() }.toTypedArray()
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
            ), EfficientSum3.threeSum(intArrayOf(0, 0, 0))
                .map { it.toIntArray() }.toTypedArray()
        )
    }
}