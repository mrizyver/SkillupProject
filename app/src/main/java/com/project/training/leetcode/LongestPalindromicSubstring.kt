package com.project.training.leetcode

import kotlin.math.min


/**
 * @see "https://leetcode.com/problems/longest-palindromic-substring/"
 * There is an example of how to achieve better performance
 * https://en.wikipedia.org/wiki/Longest_palindromic_substring#Manacher's_algorithm
 */
object LongestPalindromicSubstring {
    fun longestPalindrome(str: String): String {
        if (str.isEmpty()) return ""
        var palindrome = str.substring(0, 1)
        for (i in str.indices) {
            val len = min(str.lastIndex - i, i)
            for (l in 0..len) {
                if (i + l + 1 < str.length && str[i - l] == str[i + l + 1]) {
                    palindrome = longest(str.substring(i - l, i + l + 2), palindrome)
                } else break
            }
            for (l in 1..len) {
                if (str[i - l] == str[i + l]) {
                    palindrome = longest(str.substring(i - l, i + l + 1), palindrome)
                } else break
            }
        }
        return palindrome
    }

    fun longest(s1: String, s2: String): String = if (s1.length > s2.length) s1 else s2
}
