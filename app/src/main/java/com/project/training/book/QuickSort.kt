package com.project.training.book

object QuickSort {
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

    fun IntArray.swap(i: Int, j: Int) {
        val temp = get(i)
        set(i, get(j))
        set(j, temp)
    }
}