package homeworkLessonSpace12.gfgpractises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPractise {
    public static int getPeakElement(int[] arr) {//[1 ,2, 3, 4, 5, 3, 6, 7, 3, 2, 4]
        int peakNumber = arr[0], numberOfPeakNumber = 0;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > peakNumber) {
                peakNumber = arr[i];
                numberOfPeakNumber = i;
            }


        return peakNumber;
    }

    public static int getMaxNumberInArray(int[] arr) {
        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (maxNumber < arr[i])
                maxNumber = arr[i];

        return maxNumber;
    }

    public static String[] getLongestAndSortestWords(String[] strArr) {
        String shortest = strArr[0], longest = strArr[0];

        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() < shortest.length())
                shortest = strArr[i];

            if (strArr[i].length() > longest.length())
                longest = strArr[i];
        }

        return new String[]{shortest, longest};
    }

    public static int[] incraseAllElement(int[] arr, int incraaseValue) {
        for (int i = 0; i < arr.length; i++)
            arr[i] += incraaseValue;

        return arr;
    }

    public static int addAllPositiveNumbers(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0)
                result += arr[i];

        return result;
    }

    public static int[] shiftOneRinght(int[] arr) {
        if (arr.length == 0)
            return arr;
        /*
        int[] newArray = arr;

        newArray[0] = arr[arr.length - 1];

        for (int i =  0; i < arr.length - 1; i++){
            newArray[i] = arr[i + 1];
        }
        */

        //------------------
/*

        int x1 = arr[0], x2, lastIndex = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            x2 = arr[i];
            arr[i] = x1;
            x1 = x2;
        }
        arr[0] = lastIndex;

*/
        //------------------

        int lastIndex = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];

        arr[0] = lastIndex;
        return arr;
    }

    public static int indexOfInArray(int[] arr, int wanted) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == wanted)
                return i;
        return -1;
    }

    public static int indexOfInArray(String[] arr, String wanted) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(wanted))
                return i;
        return -1;
    }

    public static boolean containsInArray(int[] arr, int wanted) {
        return indexOfInArray(arr, wanted) != -1;
    }

    public static String listOfWantedIndex(int[] arr, int wanted) {
        String result = "";
        int indexOfNumber;

        /*
        while(true){
            indexOfNumber= indexOfInArray(arr,wanted);

            if (indexOfNumber == -1)
                break;

            result +=indexOfNumber;
            result *= 10;
            arr[indexOfNumber] = wanted + 1;
        }
        */

        while (true) {
            indexOfNumber = indexOfInArray(arr, wanted);

            if (!containsInArray(arr, wanted))
                break;

            arr[indexOfNumber] = wanted + 1;
            result += String.format("| %d ", indexOfNumber + 1);
        }

        return result + "|";
    }

    public static int[] createArrayInConsole(Scanner kb) {
        System.out.print("enter your array lenght:");
        int arrayLenght = Integer.parseInt(kb.nextLine());
        int[] arr = new int[arrayLenght];

        System.out.print("enter your array's elements;\n");
        for (int i = 0; i < arrayLenght; i++) {
            System.out.printf("enter your %d. element:", i + 1);
            arr[i] = Integer.parseInt(kb.nextLine());
        }

        return arr;
    }

    public static List<Integer> getAllElements(int[] array) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++)
            result.add(array[i]);

        return result;
    }

    public static int getMissingElement(int[] array) {
        NUMBER:
        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j < array.length; j++)
                if (i == array[j])
                    continue NUMBER;

            return i;
        }
        return -1;
    }

    public static int getDuplicatedElement(int[] array) {
        return getDuplicaedElementIndex(array);
    }
    public static int getDuplicaedElementIndex(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j)
                    continue;

                if (array[j] == array[i])
                    return j;
            }
        }
        return -1;
    }

    public static String findMaxAndMin(int[] array){
        int max = array[0], min = array[0];

        for (int i = 1; i < array.length; i++){
            if (max < array[i])
                max = array[i];

            if (min > array[i])
                min = array[i];
        }

        return String.format("Array's max value is : %d%nArray's min value is : %d%n", max, min);
    }
}

class ArrayUtils {
    public static int[] add(int[] array,int x){
        int[] newArray = new int[array.length + 1];

        System.arraycopy(array, 0, newArray, 0, array.length);// intellij onerdi

        newArray[array.length] = x;

        return newArray;
    }

    public static int[] subarray(int[] array,int beginIndex,int endIndex){
        int[] newArray = new int[endIndex - beginIndex];

        for(int i = beginIndex, j = 0; i < endIndex; i++, j++)
            newArray[j] = array[i];

        return newArray;
    }

    public static boolean contains(int[] array,int x){
        for(int i = 0; i < array.length; i++)
            if (x == array[i])
                return true;

        return false;
    }
}
class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(ArrayUtils.contains(ArrayUtils.subarray(arr, 3, 7),99));
        //String[] arr = {"Salda" , "Isa" , "Asil", "Kübra", "Elif"};
        //System.out.println(listOfWantedIndex(arr,3));

        //int[] aArrayInConsole = createArrayInConsole(new Scanner(System.in));

        //System.out.println(Arrays.toString(ArrayPractise.shiftOneRinght(arr)));
    }
}
