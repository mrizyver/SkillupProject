package com.project.training.leetcode

import org.junit.Assert.*
import org.junit.Test

class ZigzagConversionTest {

    @Test
    fun `test PAYPALISHIRING 4`(){
        assertEquals("PINALSIGYAHRPI", ZigzagConversion.convert("PAYPALISHIRING", 4))
    }

    @Test
    fun `test A 4`(){
        assertEquals("A", ZigzagConversion.convert("A", 1))
    }

    @Test
    fun `test PAYPALISHIRING 3`(){
        assertEquals("PAHNAPLSIIGYIR", ZigzagConversion.convert("PAYPALISHIRING", 3))
    }

    @Test
    fun `test AB 1`(){
        assertEquals("AB", ZigzagConversion.convert("AB", 1))
    }

    @Test
    fun `calculateIndex() test`(){
        assertEquals(7, ZigzagConversion.calculateIndex(10, 5, 8 * 2 - 4))
        assertEquals(6, ZigzagConversion.calculateIndex(6, 5, 8 * 2 - 4))
        assertEquals(10, ZigzagConversion.calculateIndex(11, 5, 8 * 2 - 4))
        assertEquals(11, ZigzagConversion.calculateIndex(4, 5, 8 * 2 - 4))
        assertEquals(1, ZigzagConversion.calculateIndex(8, 5, 8 * 2 - 4))
        assertEquals(0, ZigzagConversion.calculateIndex(0, 5, 8 * 2 - 4))
        assertEquals(4, ZigzagConversion.calculateIndex(9, 5, 8 * 2 - 4))
    }
}