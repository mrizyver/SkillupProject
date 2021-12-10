package com.project.training.book

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import kotlin.math.abs
import kotlin.random.Random
import kotlin.system.measureNanoTime

class CountingSortTest {
    @Test
    fun `test 3, 1, 2, 3, 1, 2, 3`() {
        val input = intArrayOf(3, 1, 2, 3, 1, 2, 3)
        val output = IntArray(input.size)
        assertArrayEquals(intArrayOf(1, 1, 2, 2, 3, 3, 3), CountingSort.sort(input, output, 3))
    }

    @Test
    fun `test 3, 1, 2`() {
        val input = intArrayOf(3, 1, 2)
        val output = IntArray(input.size)
        assertArrayEquals(intArrayOf(1, 2, 3), CountingSort.sort(input, output, 3))
    }

    @Test
    fun `test 3, 1`() {
        val input = intArrayOf(3, 1)
        val output = IntArray(input.size)
        assertArrayEquals(intArrayOf(1, 3), CountingSort.sort(input, output, 3))
    }

    @Test
    fun speedTest(){
        val maxNumber = 10_000
        val size = 10_000_000
        val countingInput = IntArray(size)
        val countingOutput = IntArray(size)
        val heapInput = IntArray(size)
        repeat(size){
            val num = abs(Random.nextInt() % maxNumber)
            if (num < 0 || num > maxNumber) throw IllegalArgumentException(num.toString())
            countingInput[it] = num
            heapInput[it] = num
        }
        //warm up
        CountingSort.sort(countingInput, countingOutput, maxNumber)
        HeapSort.sort(heapInput)

        val countingTime = measureNanoTime { CountingSort.sort(heapInput, countingOutput, maxNumber) }
        val heapTime = measureNanoTime { HeapSort.sort(heapInput) }
        val faster = if (countingTime < heapTime) "counting" else if (heapTime < countingTime) "heap" else "none"
        println("Counting: $countingTime, Heap: $heapTime. Faster is: $faster")
    }
}