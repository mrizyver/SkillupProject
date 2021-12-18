package com.project.training.leetcode

object TwoPointersSum2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        class Node(val value: Int, val index: Int)
        val nodes = nums.indices.map { Node(nums[it], it) }.sortedBy { it.value }
        var l = 0
        var r = nodes.lastIndex
        loop@while(l != r) {
            val sum = nodes[l].value + nodes[r].value
            when {
                sum < target -> l++
                sum > target -> r--
                else -> break@loop
            }
        }
        return intArrayOf(nodes[l].index, nodes[r].index)
    }
}

object MapSum2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) return intArrayOf(map[target - nums[i]]!!, i)
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}

