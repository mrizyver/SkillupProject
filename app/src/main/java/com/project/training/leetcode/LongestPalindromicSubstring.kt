package com.project.training.leetcode

/**
 * @see "https://leetcode.com/problems/longest-palindromic-substring/'
 */
object LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        var palindrome = s.substring(0, 1)
        for (i in s.indices) {
            var leftIndex = i
            var rightIndex = i
            do {
                if (rightIndex + 1 < s.length && s[leftIndex] == s[rightIndex + 1]) {
                    palindrome = longest(s.substring(leftIndex, rightIndex + 2), palindrome)
                } else break
            } while (--leftIndex > -1 && ++rightIndex < s.length)
            leftIndex = i
            rightIndex = i
            do {
                if (s[leftIndex] == s[rightIndex]) {
                    palindrome = longest(s.substring(leftIndex, rightIndex + 1), palindrome)
                } else break
            } while (--leftIndex > -1 && ++rightIndex < s.length)
        }
        return palindrome
    }

    fun longest(s1: String, s2: String): String = if (s1.length > s2.length) s1 else s2
}
