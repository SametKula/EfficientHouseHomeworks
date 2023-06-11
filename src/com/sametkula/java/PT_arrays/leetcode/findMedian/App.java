package com.sametkula.java.PT_arrays.leetcode.findMedian;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{1, 1 , 2,3,4,5,6,1,2,3,4,5,4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                newArray[i] = nums1[j];
                i++;
            }
            for (int j = 0; j < nums2.length; j++) {
                newArray[i] = nums2[j];
                i++;
            }
        }
        java.util.Arrays.sort(newArray);

        if(newArray.length % 2 == 0)
            return (double) (newArray[newArray.length / 2 - 1] + newArray[newArray.length / 2]) / 2;

        return  newArray[((newArray.length + 1) / 2) - 1];
    }


    public static int[] add(int[] arr, int element){
        int[] newArr = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArr, 0, arr.length);

        newArr[newArr.length - 1] = element;

        return newArr;
    }
}
