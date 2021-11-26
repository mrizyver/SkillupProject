package com.project.training.leetcode

import org.junit.Assert.*
import org.junit.Test

class LongestPalindromicSubstringTest {
    @Test
    fun `test badab`() {
        assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"))
    }

    @Test
    fun `test adab`() {
        assertEquals("aba", LongestPalindromicSubstring.longestPalindrome("abad"))
    }

    @Test
    fun `test a`() {
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"))
    }

    @Test
    fun `test aa`() {
        assertEquals("aa", LongestPalindromicSubstring.longestPalindrome("aa"))
    }

    @Test
    fun `test aaaa`() {
        assertEquals("aaaa", LongestPalindromicSubstring.longestPalindrome("aaaa"))
    }

    @Test
    fun `test abbabb`() {
        assertEquals("abba", LongestPalindromicSubstring.longestPalindrome("abbab"))
    }
    @Test
    fun `test aacabdkacaa`() {
        assertEquals("aca", LongestPalindromicSubstring.longestPalindrome("aacabdkacaa"))
    }
}