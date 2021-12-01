package com.project.training.book

import com.project.training.util.swap
import kotlin.math.floor

object SimpleQuickSort {
    fun sort(arr: IntArray, start: Int = 0, end: Int = arr.lastIndex): IntArray {
        if (start >= end) return arr
        val middle = partition(arr, start, end)
        sort(arr, start, middle - 1)
        sort(arr, middle + 1, end)
        return arr
    }

    fun partition(arr: IntArray, start: Int, end: Int): Int {
        val pivot = arr[end]
        var smallest = start - 1
        for (i in start until end) {
            if (arr[i] <= pivot) {
                smallest++
                arr.swap(smallest, i)
            }
        }
        arr.swap(smallest + 1, end)
        return smallest + 1
    }
}

object HoareQuickSort {
    fun sort(arr: IntArray, start: Int = 0, end: Int = arr.lastIndex): IntArray {
        if (start >= end) return arr
        val pivot = partition(arr, start, end)
        sort(arr, start, pivot)
        sort(arr, pivot + 1, end)
        return arr
    }

    fun partition(arr: IntArray, start: Int, end: Int): Int {
        val pivot = arr[floor((start + end) / 2f).toInt()]
        var left = start - 1
        var right = end + 1
        while (true) {
            do left++ while (arr[left] < pivot)
            do right-- while (arr[right] > pivot)
            if (left < right) arr.swap(left, right)
            else return right
        }
    }
}
