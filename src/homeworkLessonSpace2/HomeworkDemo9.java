package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to speed calculator");
        while (true){
            int gearSize = 0, cendence = 0;
            System.out.print("Gear Size :");
            gearSize = keyboard.nextInt();
            System.out.print("Cendence :");
            cendence = keyboard.nextInt();
            System.out.printf("your speed is : %.0f %n ",speedCalculator(gearSize,cendence));
        }
    }
    public static double speedCalculator(int gearSize, int cendence){
            return (gearSize*Math.PI*(1/5280.00)*(1/12.00)*cendence*60);
    }
}
