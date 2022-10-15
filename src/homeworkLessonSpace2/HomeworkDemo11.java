package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double time , pace, distance;

        System.out.println("This program calculates your pace given a time and distance traveled.");
        System.out.print("time:");
        time = keyboard.nextInt(); /*35 minutes and 30 seconds*/
        System.out.print("ditance:");
        distance = keyboard.nextDouble();
        pace = time /distance;
        System.out.printf("Your pace is %.2f miles per hour.",pace);
    }
}
