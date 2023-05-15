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

    public static int[] incraseAllElementsByTwo(int[] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] += 2;

        return arr;
    }

    public static int addAllPositiveNumbers(int[] arr){
        int result = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0)
                result += arr[i];

        return result;
    }

    public static int[] shiftOneRinght(int[] arr){
        /*
        int[] newArray = arr;

        newArray[0] = arr[arr.length - 1];

        for (int i =  0; i < arr.length - 1; i++){
            newArray[i] = arr[i + 1];
        }
        */

        //------------------
        int x1 = arr[0], x2 , lastIndex = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++){
            x2 = arr[i];
            arr[i] = x1;
            x1 = x2;
        }
        arr[0] = lastIndex;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        //String[] arr = {"Salda" , "Isa" , "Asil", "Kübra", "Elif"};
        System.out.println(Arrays.toString(shiftOneRinght(arr)));
    }
}
