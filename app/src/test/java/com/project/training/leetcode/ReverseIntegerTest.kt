package com.project.training.leetcode

import org.junit.Assert.*
import org.junit.Test

class ReverseIntegerTest {

    @Test
    fun `reverse(123)`() {
        assertEquals(321, TrivialReverseInteger.reverse(123))
    }

    @Test
    fun `reverse(-123)`() {
        assertEquals(-321, TrivialReverseInteger.reverse(-123))
    }

    @Test
    fun `reverse(1534236469)`() {
        assertEquals(0, TrivialReverseInteger.reverse(1534236469))
    }
}