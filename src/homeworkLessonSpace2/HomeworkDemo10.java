package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int time = keyboard.nextInt();
        int hours , minutes , seconds;
        seconds =  time % 60;
        minutes =  time /60;// 1
        hours =   minutes/60;
        minutes = minutes%60;
        System.out.printf("%d Hours, %d Minutes, %d Seconds ",hours,minutes,seconds);

    }
}
