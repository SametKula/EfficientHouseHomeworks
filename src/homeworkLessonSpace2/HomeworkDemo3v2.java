package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo3v2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to piglatinator \nplease enter your want to transform to piglatinator (end code is \"end\")\n");
        while (true) {
            System.out.print("input:");
            String input = keyboard.nextLine();
            if (input.equals("end")) break;
            System.out.print("output:");
            System.out.print(latinPiganator(input) + " \n");


        }


    }


    public static String latinPiganator(String... strings) {
        String latinPigWords = "";
        for (String string : strings) {
            String str3 = string.substring(1, 2).toUpperCase() + string.substring(2) + string.substring(0, 1).concat("ay");
            latinPigWords += str3.concat(" ");
        }


        return latinPigWords;
    }
}
