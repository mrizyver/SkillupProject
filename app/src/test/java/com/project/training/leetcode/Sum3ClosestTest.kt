package com.project.training.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class Sum3ClosestTest {
    @Test
    fun `test -1,2,1,-4`() {
        assertEquals(2, Sum3Closest.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1))
    }

    @Test
    fun `test 1,1,-1,-1,3`() {
        assertEquals(-1, Sum3Closest.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1))
    }
}