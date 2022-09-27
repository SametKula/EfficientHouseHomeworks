package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo6 {
    public static void main(String[] args) {
        //Scanner class
        Scanner keyboard = new Scanner(System.in);
        //variables
        String allWords = "", input = "" , breakWord = "elma";
        //System message
        System.out.println("Please enter your inputs to want to be combine ...");
        //while loop for the combine
        while (!input.equalsIgnoreCase(breakWord)) {
            if (input.equalsIgnoreCase(breakWord))break;
            input = keyboard.nextLine();
            input = input.trim();
            allWords += allWords.equals("")?input:"-".concat(input);
        }
        System.out.println(allWords);
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
