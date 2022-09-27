package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo8 {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        System.out.print("enter your end word: ");
        String endWord;
        while (true) {
            endWord = keyword.nextLine().trim();
            if (!endWord.isEmpty()) break;
            System.out.println("your end word is empty please enter vlaid value");
        }
        System.out.printf("your app break key is %s%n", endWord);

        System.out.print("enter your split word: ");
        String splitWord;
        while (true) {
            splitWord = keyword.nextLine().trim();
            if (!splitWord.isEmpty()) break;
            System.out.println("your split word is empty please enter vlaid value");
        }
        System.out.printf("your app split word key is %s%n", splitWord);

        System.out.println("enter values you want to be combined by custom split word");
        String result = "";
        for (; ; ) {
            String input = keyword.nextLine().trim();
            if (input.isEmpty()) continue;
            if (input.equals(endWord)) break;
            result += input + splitWord;
        }
        if (!result.isEmpty()) {
            System.out.printf("results is : %s  ", result.substring(0, result.length() - splitWord.length()));
        } else {
            System.out.println("You finished without enter any word");
        }


    }
}
