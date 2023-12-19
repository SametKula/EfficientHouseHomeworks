package com.sametkula.java.PT_arrays.leetcode.medianofTwoSortedArrays

import org.junit.Test
import org.junit.jupiter.api.Assertions

class App {
    //it is test for intellij idea's auto transform to kotlin file
    @Test
    fun test() {
        val arr1 = intArrayOf(1, 2, 3, 4, 5, 6)
        val arr2 = intArrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
        Assertions.assertEquals(5.0, findMedianSortedArrays(arr1, arr2))
    }

    companion object {
        fun findMedianSortedArrays(nums1: IntArray?, nums2: IntArray?): Double {
            if (nums1 == null || nums2 == null)
                return 0.0
            var n = 0
            var m = 0
            var i = 0
            val result = IntArray(nums1.size + nums2.size)
            while (n < nums1.size && m < nums2.size) {
                if (nums1[n] < nums2[m]) {
                    result[i++] = nums1[n++]
                } else result[i++] = nums2[m++]
            }
            val left: IntArray = if (m != nums2.size) nums2 else nums1
            var l = if (m != nums2.size) m else n
            while (l < left.size) {
                result[i++] = left[l++]
            }
            return if (result.size % 2 == 0) (result[result.size / 2] + result[result.size / 2 - 1]).toDouble() / 2 else result[result.size / 2].toDouble()
        }
    }
}