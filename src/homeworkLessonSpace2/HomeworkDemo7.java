package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo7 {
    public static void main(String[] args) {
            Scanner keyword = new Scanner(System.in);
            String input = keyword.nextLine().toLowerCase().trim();
            if (!input.isEmpty()){//if value is not empty its works
                String inputFirstLetter = input.charAt(0) + "";
                input = input.replaceFirst(inputFirstLetter.toLowerCase(),inputFirstLetter.toUpperCase());
            }else {
                input = "your value is empty";
            }
            System.out.println(input);
    }
}
