package homeworkLessonSpace3;

import java.util.Scanner;

public class HomeworkSpace3 {
    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        System.out.print("number: ");
        int input = keyboard.nextInt();
        System.out.printf("your input returns : %d",signum(input));
    }
    public static int signum (int number){
        if (number == 0) return 0;
        return number < 0 ? -1 : 1 ;
    }
}
