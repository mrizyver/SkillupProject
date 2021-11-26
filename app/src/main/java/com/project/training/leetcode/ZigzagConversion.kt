package com.project.training.leetcode

import kotlin.math.*


/**
 * @see "https://leetcode.com/problems/zigzag-conversion/"
 */
object ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        val array = CharArray(s.length)
        for (i in s.indices) array[calculateIndex(i, numRows, s.length)] = s[i]
        return String(array)
    }

    fun calculateIndex(i: Int, rows: Int, len: Int): Int {
        val seqLen = max(rows + rows - 2, 1)
        val seqWidth = max(1 + rows - 2, 1)
        val seqIndex = i / seqLen
        val indexInSeq = i % seqLen
        val columnIndex = seqIndex * seqWidth + indexInSeq / rows
        val rowIndex = rows - 1 - abs(indexInSeq - (rows - 1))
        val numbersOnTopRowsOfSeq = max((rows - (rows - rowIndex)) * 2 - 1, 0)
        val absentNumbersInLastSeq = seqLen - (len % seqLen)
        val excludedTailInLasSeq = (seqLen - numbersOnTopRowsOfSeq) + (numbersOnTopRowsOfSeq / 2)
        val allExcludedNumbersInLasSeq = (seqLen - numbersOnTopRowsOfSeq) + absentNumbersInLastSeq
        val integrityOfLasSeq = (ceil(len * 1f / seqLen) - floor(len * 1f / seqLen)).toInt()
        val excludedNumbersInLasSeq = max(absentNumbersInLastSeq, min(excludedTailInLasSeq, allExcludedNumbersInLasSeq))
        val numbersOnTopRowsOfLastSeq = (seqLen - excludedNumbersInLasSeq) * integrityOfLasSeq
        val numbersOnTopRowsOfSequences = numbersOnTopRowsOfSeq * (len / seqLen) + numbersOnTopRowsOfLastSeq
        val numbersInRowOfSeq = if (rowIndex == 0 || rowIndex == rows - 1) 1 else 2
        return numbersInRowOfSeq * seqIndex + columnIndex % seqWidth + numbersOnTopRowsOfSequences
    }
}
