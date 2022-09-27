package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo6 {
    public static void main(String[] args) {
        //Scanner class
        Scanner keyboard = new Scanner(System.in);
        //variables
        String allWords = "", breakWord = "elma";
        //System message
        System.out.println("Please enter your inputs to want to be combine ...");
        //while loop for the combine
        while (true) {
            String input = keyboard.nextLine();
            if (input.trim().isEmpty())continue;
            if (input.equalsIgnoreCase(breakWord)) break;
            allWords += "-".concat(input.trim());
        }
        System.out.println(allWords.substring(1,allWords.length()));
        /*
        Please enter your inputs to want to be combine ...
        ankara
        istanbul
        izmir
        zonguldak
        elma
        ankara-istanbul-izmir-zonguldak
         */
    }
}
