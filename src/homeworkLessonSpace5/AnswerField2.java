package homeworkLessonSpace5;

import java.util.Locale;

public class AnswerField2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("please what do you want to turn a pig latin word's first word: ");
        String input1 = keyboard.next();

        System.out.print("please what do you want to turn a pig latin word's second word: ");
        String input2 = keyboard.next();

        System.out.println();
        displayPigLatinWord(pigLatinator(input1, input2));
    }

    public static String pigLatinator(String f, String l) {
        return getPigLatinWord(f) + " " + getPigLatinWord(l);
    }

    public static void displayPigLatinWord(String x) {
        System.out.println("these are the pig latin word which both of your wanted words => " + x);
    }

    public static String getPigLatinWord(String x) {
        return x.substring(1, 2).toUpperCase() + x.substring(2, x.length()) + x.substring(0, 1).toLowerCase() + "ay";
    }
}
