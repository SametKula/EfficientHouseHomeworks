package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Welcome to calorie Calculator%n");
        System.out.printf("%nplease enter a value -----------(insert type >>>\"activity,weight(kg),minutes\") (activities is : running , basketball , sleeping):%n");
        System.out.print("Activitie:");
        String sports = keyboard.next();
        System.out.print("Weight:");
        int weight = keyboard.nextInt();
        System.out.print("Minutes:");
        int minutes = keyboard.nextInt();




        System.out.println("▬▬▬  your calorie expenditure is "+caloriesCalculator(sports,weight,minutes)+" calories  ▬▬▬");




    }

    public static double caloriesCalculator(String met, double weight, int minutes) {
        double cal = 1;
        if (met.equalsIgnoreCase("running")) {
            cal = (175.0 / 1000.0) * 10 * weight * minutes;
        };
        if (met.equalsIgnoreCase("basketball")) {
            cal = (175 / 1000.0) * 8 * weight * minutes;
        }
        if (met.equalsIgnoreCase("sleeping")) {
            cal = (175.0 / 1000.0) * 1 * weight * minutes;
        }

        return (int)cal;
    }
    /*      terminal output is :
            Welcome to calorie Calculator

            please enter a value -----------(insert type >>>"activity,weight(kg),minutes")
            >>>Basketball
            >>>68
            >>>30
            ▬▬▬your calorie expenditure is 3570.0 calories▬▬▬

            please enter a value -----------(insert type >>>"activity,weight(kg),minutes")
            >>>Basketball
            >>>68
            >>>30
            ▬▬▬your calorie expenditure is 2855.0 calories▬▬▬

            please enter a value -----------(insert type >>>"activity,weight(kg),minutes")
            >>>Basketball
            >>>68
            >>>30
            ▬▬▬your calorie expenditure is 4283.0 calories▬▬▬*/
}
