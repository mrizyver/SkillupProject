package com.project.training.book

object HeapSort {
    /**
     * running time is O(n lg(n))
     * more precisely it's O(n lg(n)) + O(n lg(n))
     */
    fun sort(arr: IntArray): IntArray {
        buildMaxHeap(arr)
        var size = arr.size
        for (i in arr.lastIndex downTo 1) {
            arr.swap(0, i)
            maxHeapify(arr, 0, --size)
        }
        return arr
    }

    /**
     * running time is O(n lg(n))
     */
    fun buildMaxHeap(arr: IntArray) {
        for (i in (arr.size / 2) downTo 1) {
            maxHeapify(arr, i, arr.size)
        }
    }

    /**
     * running time is O(lg(n))
     */
    fun maxHeapify(arr: IntArray, i: Int, size: Int) {
        val l = left(i)
        val r = raight(i)
        var largest: Int = if (l < size && arr[l] > arr[i]) l else i
        if (r < size && arr[r] > arr[i]) largest = r

        if (largest != i) {
            arr.swap(largest, i)
            maxHeapify(arr, largest, size)
        }
    }

    fun left(index: Int) : Int = 2 * index
    fun raight(index: Int) : Int = 2 * index + 1

    fun IntArray.swap(i: Int, j :Int){
        val temp = get(i)
        set(i, get(j))
        set(j, temp)
    }
}