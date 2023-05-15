package homeworkLessonSpace12.gfgpractises;

import java.util.Arrays;

public class ArrayPractise {
    public static int getPeakElement (int[] arr){//[1 ,2, 3, 4, 5, 3, 6, 7, 3, 2, 4]
        int peakNumber = arr[0] ,numberOfPeakNumber = 0;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > peakNumber){
                peakNumber = arr[i];
                numberOfPeakNumber = i;
            }


        return peakNumber;
    }

    public static int getMaxNumberInArray(int[] arr){
        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (maxNumber < arr[i])
                maxNumber = arr[i];

        return maxNumber;
    }

    public static String[] getLongestAndSortestWords(String[] strArr){
        String shortest = strArr[0], longest = strArr[0];

        for (int i = 1; i < strArr.length; i++){
            if (strArr[i].length() < shortest.length())
                shortest = strArr[i];

            if (strArr[i].length() > longest.length())
                longest = strArr[i];
        }

        return new String[]{shortest,longest};
    }

    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6,7,8,9,4,6,345,65,4,5};

        String[] arr = {"Salda" , "Isa" , "Asil", "Kübra", "Elif"};
        System.out.println(Arrays.toString(getLongestAndSortestWords(arr)));
    }
}
