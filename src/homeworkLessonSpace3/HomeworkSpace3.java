package homeworkLessonSpace3;

import java.util.Scanner;

public class HomeworkSpace3 {
    public static void main(String[] args) {

        run();

    }

    private static void run() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter a number");

        System.out.print("number: ");
        int input = keyboard.nextInt();

        display(signum(input));
    }

    public static void display(int x) {
        if (x == -1)
            System.out.println("the number your entered is negative");
        else if (x == 1)
            System.out.println("the number your entered is positive");
        else
            System.out.println("the number your entered is zero");
    }

    public static int signum(int x) {
        if (x < 0)
            return -1;

        if (x > 0)
            return 1;

        return 0;
    }
}
