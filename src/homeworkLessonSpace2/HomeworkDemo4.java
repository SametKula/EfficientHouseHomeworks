package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //system message
        System.out.printf("%nWelcome to soda pop risk calculator%nPlease enter your present weight ,the weight you want to be and probably time will pass%n");

        //variables
        System.out.print("current weight:");
        int firstWeight = keyboard.nextInt();
        System.out.print("desired weight:");
        int desiredWeight = keyboard.nextInt();
        System.out.print("when the diet passes:");
        int elapsedTime = keyboard.nextInt();


        //risk calculator


        int result = (firstWeight-desiredWeight)/elapsedTime;
        //if else statement
        String finalResult = result == 0 ?"not risky":"risky";
        System.out.println(finalResult);
        /*System output is:
        Please enter your present weight ,the weight you want to be and probably time will pass
        >>>100,90,10
        ---------------------------
        not risky

         */



    }
}
