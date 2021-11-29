package com.project.training.book

import org.junit.Assert
import org.junit.Test

class HeapSortTest {

    @Test
    fun `test 3, 1, 2, 3, 1, 2, 3`() {
        Assert.assertArrayEquals(
            intArrayOf(1, 1, 2, 2, 3, 3, 3),
            HeapSort.sort(intArrayOf(3, 1, 2, 3, 1, 2, 3))
        )
    }

    @Test
    fun `test 1, 2, 3`() {
        Assert.assertArrayEquals(
            intArrayOf(1, 2, 3),
            HeapSort.sort(intArrayOf(3, 1, 2))
        )
    }

    @Test
    fun `test 3, 1`() {
        Assert.assertArrayEquals(
            intArrayOf(1, 3),
            HeapSort.sort(intArrayOf(3, 1))
        )
    }
}