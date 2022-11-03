package homeworkLessonSpace5;

public class AnswerField5 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        //i will add marked exit loop
        while(true)
            displayCalculatedGPA();
    }

    public static void displayCalculatedGPA(){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("please enter your point : ");
        int point = keyboard.nextInt();
        System.out.printf("your point over 100 is : %d%nyour GPA point is : %.2f%n",point,gpaCalculator(point));
    }

    public static double gpaCalculator(int x){
        return ((x+0.000001)/100)*4;
    }
}
