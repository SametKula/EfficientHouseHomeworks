package com.sametkula.java.PT_arrays.efficentHouseHW;


import java.util.Arrays;

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
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] getOddElements(int[] arr) {
        int[] temp = new int[0];
        for (int i : arr)
            if (i % 2 == 1)
                temp = addElement(temp, i);
        return temp;
    }

    private static int[] addElement(int[] arr, int element) {
        int[] temp = new int[arr.length + 1];

        System.arraycopy(arr, 0, temp, 0, arr.length);

        temp[arr.length] = element;

        return temp;
    }

    public static double getMedial(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum / (double) arr.length;
    }

    public static int min(int[] arr) {
        return min(arr, 0, arr.length);
    }

    public static int min(int[] arr, int start, int end) {
        int min = arr[start];

        for (int i = start + 1; i < end; i++)
            if (min > arr[i])
                min = arr[i];

        return min;
    }

    public static int getSumOfEven(int[] arr) {
        int sum = 0;

        for (int i : arr)
            if (i % 2 == 0)
                sum += i;

        return sum;
    }

    private static boolean contains(int[] arr, int x) {
        for (int i : arr)
            if (i == x) return true;

        return false;
    }

    public static int[] getSameElements(int[] arr, int[] tar) {
        int[] sum = new int[0];

        for (int i : tar)
            if (contains(arr, i) && contains(tar, i))
                sum = addElement(sum, i);

        return sum;
    }

    public static void shortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
    }
}
