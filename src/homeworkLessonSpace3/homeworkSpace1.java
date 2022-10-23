package homeworkLessonSpace3;

import java.util.Scanner;

public class homeworkSpace1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne , numberTwo , numberTheree , highest , lowest , mid;
        String out = "";


        numberOne = keyboard.nextInt();
        numberTwo = keyboard.nextInt();
        numberTheree = keyboard.nextInt();

        highest = numberTheree;

        // 60 30 50
        if (numberOne > numberTwo)
        {
            if (numberOne > numberTheree)
            {
                highest = numberOne;
            }
            if (numberTwo > numberTheree)
            {
                lowest = numberTheree;
                mid = numberTwo;
            }
            else
            {
                lowest = numberTwo;
                mid = numberTheree;
            }
        }
        else
        {
            if (numberTwo > numberTheree)
            {
                highest = numberTwo;
            }
            if (numberOne > numberTheree)
            {
                lowest = numberTheree;
                mid = numberOne;
            }
            else
            {
                lowest = numberOne;
                mid = numberTwo;

            }
        }




        System.out.printf("en büyük : %d %nortanca : %d         %nen küçük : %d ", highest,mid,lowest);





    }
}
