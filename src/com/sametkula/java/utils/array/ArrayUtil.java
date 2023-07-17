package com.sametkula.java.utils.array;

import java.lang.reflect.Array;

public class ArrayUtil {
    public static int binarySearch(int[] array, int target){
        int start = 0, end = array.length - 1;

        while(start <= end){
           int middle = (start + end) / 2, middleElement = array[middle];

           if (middleElement == target)
               return middle;
           else if (middleElement < target)
               start = middle + 1;
           else
               end = middle -1;
        }
        return -1;
    }


}
