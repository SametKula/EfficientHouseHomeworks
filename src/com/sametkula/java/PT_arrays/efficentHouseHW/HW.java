package com.sametkula.java.PT_arrays.efficentHouseHW;


public class HW {
    public static int maxElement(int[] arr) {
        int result = arr[0];

        for (int j : arr)
            if (result < j)
                result = j;

        return result;
    }
    public static int addAllElements(int[] arr) {
        int sum = 0;

        for (int i : arr)
            sum += i;

        return sum;
    }
    public static int counter(int[] arr, int target) {
        int count = 0;

        for (int i : arr)
            if (target == i)
                count++;

        return count;
    }
    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

}
