package homeworkLessonSpace12.gfgpractises;

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


}
