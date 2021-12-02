package com.project.training.util

fun IntArray.swap(i: Int, j: Int) {
    val temp = get(i)
    set(i, get(j))
    set(j, temp)
}