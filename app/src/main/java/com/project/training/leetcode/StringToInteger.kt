package com.project.training.leetcode

/**
 * @see "https://leetcode.com/problems/string-to-integer-atoi/"
 */
object StringToInteger {
    fun myAtoi(s: String): Int {
        var result = 0
        var sign: Int? = null
        var numberWasMet = false
        var signWasMet = false
        loop@ for (c in s) {
            if (c.isDigit()) numberWasMet = true
            if (!c.isDigit() && numberWasMet) break@loop
            if (c == '+' || c == '-') signWasMet = true
            if (!c.isDigit() && c != '+' && c != '-' && signWasMet) break@loop
            when {
                c == ' ' -> if (numberWasMet) break@loop else continue@loop
                c == '-' -> sign = if (sign != null) return 0 else -1
                c == '+' -> sign = if (sign != null) return 0 else 1
                c.isDigit() -> {
                    @Suppress("DEPRECATION") //the only toInt() method works on the leetcode
                    var num = c.toInt() - '0'.toInt()
                    if (sign != null) num *= sign
                    if (result < Int.MIN_VALUE / 10 || result == Int.MIN_VALUE / 10 && num < -8) return Int.MIN_VALUE
                    if (result > Int.MAX_VALUE / 10 || result == Int.MAX_VALUE / 10 && num > 7) return Int.MAX_VALUE
                    result *= 10
                    result += num
                }
                else -> break@loop
            }
        }
        return result
    }
}