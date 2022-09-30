package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to ideal wight calculator....");

        System.out.print("please enter your height (feet):");
        int defaultWeight = 110;
        double heightFt = keyboard.nextDouble();//6 72 feet - 60 feet => 12 feet * 5 pound  => 60 pound + 110 pound => idal wight
        double heightInches = (heightFt * 12) - 60;
        heightInches *= 5;// now its type pound
        double idealWight = (double) defaultWeight + heightInches;


        System.out.printf("height is : %.1f .Your ideal weight is : %.1f ", heightFt, idealWight);
    }
}
