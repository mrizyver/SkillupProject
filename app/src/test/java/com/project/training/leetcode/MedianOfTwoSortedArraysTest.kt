package com.project.training.leetcode

import com.project.training.leetcode.MedianOfTwoSortedArrays.findMedianSortedArrays
import org.junit.Assert.*
import org.junit.Test

private const val DELTA = 1e-15

class MedianOfTwoSortedArraysTest {

    @Test
    fun `test 1, 3, 5, 8 to 1, 3, 4, 5`() {
        assertEquals(
            (3 + 4) / 2.0,
            findMedianSortedArrays(
                intArrayOf(1, 3, 5, 8),
                intArrayOf(1, 3, 4, 5)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1, 3 to 2`() {
        assertEquals(
            2.0,
            findMedianSortedArrays(
                intArrayOf(1, 3),
                intArrayOf(2)
            ),
            DELTA
        )
    }

    @Test
    fun testZeros() {
        assertEquals(
            0.0,
            findMedianSortedArrays(
                intArrayOf(0, 0),
                intArrayOf(0, 0)
            ),
            DELTA
        )
    }

    @Test
    fun `test  to 1`() {
        assertEquals(
            1.0,
            findMedianSortedArrays(
                intArrayOf(),
                intArrayOf(1)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1, 3 to 2, 7`() {
        assertEquals(
            2.5,
            findMedianSortedArrays(
                intArrayOf(1, 3),
                intArrayOf(2, 7)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1, 3, 7 to 2, 4, 6`() {
        assertEquals(
            3.5,
            findMedianSortedArrays(
                intArrayOf(1, 3, 5),
                intArrayOf(2, 4, 6)
            ),
            DELTA
        )
    }

    @Test
    fun `test 2, 4, 6 to 1, 3, 7`() {
        assertEquals(
            3.5,
            findMedianSortedArrays(
                intArrayOf(2, 4, 6),
                intArrayOf(1, 3, 5)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1, 2 to 3, 4`() {
        assertEquals(
            2.5,
            findMedianSortedArrays(
                intArrayOf(1, 2),
                intArrayOf(3, 4)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1, 2 to -1, 3`() {
        assertEquals(
            1.5,
            findMedianSortedArrays(
                intArrayOf(1, 2),
                intArrayOf(-1, 3)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1, 2 to 1, 2, 3`() {
        assertEquals(
            2.0,
            findMedianSortedArrays(
                intArrayOf(1, 2),
                intArrayOf(1, 2, 3)
            ),
            DELTA
        )
    }

    @Test
    fun `test 3 to -2, -1`() {
        assertEquals(
            -1.0,
            findMedianSortedArrays(
                intArrayOf(3),
                intArrayOf(-2, -1)
            ),
            DELTA
        )
    }

    @Test
    fun `test 1 to 2, 3, 4`() {
        assertEquals(
            2.5,
            findMedianSortedArrays(
                intArrayOf(1),
                intArrayOf(2, 3, 4)
            ),
            DELTA
        )
    }

    @Test
    fun `test 2, 3, 4 to 1`() {
        assertEquals(
            2.5,
            findMedianSortedArrays(
                intArrayOf(2, 3, 4),
                intArrayOf(1)
            ),
            DELTA
        )
    }
}
