package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo6 {
    public static void main(String[] args) {
        //Scanner class
        Scanner keyboard = new Scanner(System.in);
        //variables
        String allWords = "", input = "";
        System.out.println("Please enter your inputs to want to be combine ...");
        while (!input.equalsIgnoreCase("elma")) {
            input = keyboard.nextLine();
            input = input.trim();
            if (input.equalsIgnoreCase("elma"))break;
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
