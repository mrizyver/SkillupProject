package com.project.training.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class IntToRomanTest {
    @Test
    fun test1994() {
        assertEquals("MCMXCIV", IntToRoman.intToRoman(1994))
    }

    @Test
    fun test777() {
        assertEquals("DCCLXXVII", IntToRoman.intToRoman(777))
    }
}