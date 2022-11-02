package homeworkLessonSpace5;


public class AnswerField4 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){

        displayTime(timeCalculatorBySpeedAndDistance());

    }

    public static void displayTime(double x){
        System.out.printf("time to pass is : %.2f minutes",x);
    }
    public static double timeCalculatorBySpeedAndDistance(){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);


        System.out.print("enter your distance: ");
        double x = keyboard.nextDouble();

        System.out.print("enter your speed: ");
        double y = keyboard.nextDouble();

        return (0.000000000001+x)/y ;
    }

}
