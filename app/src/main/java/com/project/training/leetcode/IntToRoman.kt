package com.project.training.leetcode

object IntToRoman {
    fun intToRoman(num: Int): String {
        val stringBuilder = StringBuilder()
        stringBuilder.add(num / 1000, 'M', ' ', ' ')
        stringBuilder.add(num % 1000 / 100, 'C', 'D', 'M')
        stringBuilder.add(num % 100 / 10, 'X', 'L', 'C')
        stringBuilder.add(num % 10, 'I', 'V', 'X')
        return stringBuilder.toString()
    }

    fun StringBuilder.add(placeValue: Int, low: Char, mid: Char, high: Char) {
        when {
            placeValue == 9 -> append(low).append(high)
            placeValue == 5 -> append(mid)
            placeValue == 4 -> append(low).append(mid)
            placeValue < 4 -> repeat(placeValue) { append(low) }
            else -> append(mid).also { repeat(placeValue - 5) { append(low) } }
        }
    }
}