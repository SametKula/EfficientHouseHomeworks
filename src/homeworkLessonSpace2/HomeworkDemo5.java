package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //paragraph
        //replace words
        System.out.printf("Please enter a paragraph and two words you want to change between%ninput type is (paragraph,word one,word two)%n");
        System.out.print("paragraph:");
        String str1 = keyboard.nextLine();


        System.out.print("want to be change:");
        String word1 = keyboard.nextLine();


        System.out.print("I want it to be changed:");
        String word2 = keyboard.nextLine();


        //replace field
        str1 = str1.replaceAll(word1, word2);
        //result
        System.out.println(str1);
        //system out is
        /*Please enter two words you want to change between
        input type is (paragraph,word one,word two)
        >>>"I hate everything , I hate purple, I hate tarhana soup, I hate etliekmek",hate,love
        I love everything , I love purple, I love tarhana soup, I love etliekmek*/
    }
}
