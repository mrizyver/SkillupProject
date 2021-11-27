package com.project.training.leetcode

import org.junit.Assert.*
import org.junit.Test

class StringToIntegerTest{

    @Test
    fun `test 42`(){
        assertEquals(42, StringToInteger.myAtoi("42"))
    }

    @Test
    fun `test +1`(){
        assertEquals(1, StringToInteger.myAtoi("+1"))
    }

    @Test
    fun `test 9223372036854775808`(){
        assertEquals(2147483647, StringToInteger.myAtoi("9223372036854775808"))
    }

    @Test
    fun `test 2147483646`(){
        assertEquals(2147483646, StringToInteger.myAtoi("2147483646"))
    }

    @Test
    fun `test   +  413`(){
        assertEquals(0, StringToInteger.myAtoi("  +  413"))
    }

    @Test
    fun `test ,1`(){
        assertEquals(0, StringToInteger.myAtoi(".1"))
    }

    @Test
    fun `test 3,14159`(){
        assertEquals(3, StringToInteger.myAtoi("3.14159"))
    }

    @Test
    fun `test words and 987`(){
        assertEquals(0, StringToInteger.myAtoi("words and 987"))
    }

    @Test
    fun `test 00000-42a1234`(){
        assertEquals(0, StringToInteger.myAtoi("00000-42a1234"))
    }

    @Test
    fun `test ++1`(){
        assertEquals(0, StringToInteger.myAtoi("++1"))
    }
}