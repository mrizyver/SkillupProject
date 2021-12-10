package com.project.training.book

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import kotlin.math.abs
import kotlin.random.Random
import kotlin.system.measureNanoTime

class BucketSortTest {

    @Test
    fun `test 0'9, 0'5, 0'1`() {
        val input = floatArrayOf(0.9f, 0.5f, 0.1f)
        assertArrayEquals(
            floatArrayOf(0.1f, 0.5f, 0.9f).toTypedArray(),
            FloatBucketSort.sort(input).toTypedArray()
        )
    }

    @Test
    fun `test 9, 5, 1`() {
        val input = intArrayOf(9, 5, 1)
        assertArrayEquals(
            intArrayOf(1, 5, 9),
            IntBucketSort.sort(input, 9)
        )
    }

    @Test
    fun speedTest() {
        val sizes = intArrayOf(10, 100, 1000, 10000, 100000)
        repeat(10) { //warm up
            FloatBucketSort.sort(FloatArray(it * it) { abs(Random.nextFloat() % 1) })
        }
        val times = sizes.map {
            it to measureNanoTime {
                FloatBucketSort.sort(FloatArray(it) { abs(Random.nextFloat() % 1) })
            }
        }.toList()
        println(times.joinToString())
    }
}