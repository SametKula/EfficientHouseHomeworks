package com.sametkula.java.PT_arrays.leetcode.medianofTwoSortedArrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class App {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return 0;
        int n = 0, m = 0, i = 0;
        int[] result = new int[nums1.length + nums2.length];

        while (n < nums1.length && m < nums2.length){
            if (nums1[n] < nums2[m]){
                result[i++] = nums1[n++];
            }else
                result[i++] = nums2[m++];
        }
        int[] left = m != nums2.length ? nums2 : nums1;
        int l = m != nums2.length ? m : n;

        while (l < left.length){
            result[i++] = left[l++];
        }

        if (result.length % 2 == 0)
            return (double) (result[result.length / 2] + result[(result.length / 2) - 1]) / 2;
        return result[result.length / 2];
    }

    @Test
    public void test(){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,3,4,5,6,7,8,9,10};

        Assertions.assertEquals(5, findMedianSortedArrays(arr1, arr2));
    }

}