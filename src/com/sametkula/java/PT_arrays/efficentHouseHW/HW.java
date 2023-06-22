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
    public static int[] getOddElements(int[] arr){
        int[] temp = new int[0];
        for(int i: arr)
            if (i % 2 == 1)
                temp = addElement(temp,i);
        return temp;
    }
    private static int[] addElement(int[] arr, int element){
        int[] temp = new int[arr.length + 1];

        System.arraycopy(arr, 0, temp, 0, arr.length);

        temp[arr.length] = element;

        return temp;
    }
    public static double getMedial (int[] arr){
        int sum = 0;
        for(int i : arr)
            sum += i;
        return sum / (double)arr.length;
    }
    public static int min(int[] arr){
        int min = arr[0];

        for(int i : arr)
            if (min > i)
                min = i;

        return min;
    }
}
