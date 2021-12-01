package com.project.training.book

import org.junit.Assert.*
import org.junit.Test

class QuickSortTest{

    @Test
    fun `test 3, 1, 2, 3, 1, 2, 3`() {
        assertArrayEquals(
            intArrayOf(1, 1, 2, 2, 3, 3, 3),
            SimpleQuickSort.sort(intArrayOf(3, 1, 2, 3, 1, 2, 3))
        )
        assertArrayEquals(
            intArrayOf(1, 1, 2, 2, 3, 3, 3),
            HoareQuickSort.sort(intArrayOf(3, 1, 2, 3, 1, 2, 3))
        )
    }

    @Test
    fun `test 1, 2, 3`() {
        assertArrayEquals(
            intArrayOf(1, 2, 3),
            SimpleQuickSort.sort(intArrayOf(3, 1, 2))
        )
        assertArrayEquals(
            intArrayOf(1, 2, 3),
            HoareQuickSort.sort(intArrayOf(3, 1, 2))
        )
    }

    @Test
    fun `test 3, 1`() {
        assertArrayEquals(
            intArrayOf(1, 3),
            SimpleQuickSort.sort(intArrayOf(3, 1))
        )
        assertArrayEquals(
            intArrayOf(1, 3),
            HoareQuickSort.sort(intArrayOf(3, 1))
        )
    }
}

