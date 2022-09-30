package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true){
            int gearSize = 0, cendence = 0;
            gearSize = keyboard.nextInt();
            cendence = keyboard.nextInt();
            System.out.printf("your speed is : %.0f %n ",speedCalculator(gearSize,cendence));
        }
    }
    public static double speedCalculator(int gearSize, int cendence){
            return (gearSize*Math.PI*(1/5280.00)*(1/12.00)*cendence*60);
    }
}
