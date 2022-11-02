package homeworkLessonSpace5;

public class AnswerField3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        divicedDetailedNumbers(25, 12);
    }

    public static void divicedDetailedNumbers(int x, int y) {
        double temp = x / y;
        double remain = x % y;

        System.out.printf("the divisor is : %d %nthe quotient is : %d %nx : %.0f %nthe remain : %.0f ", x, y, temp, remain);


    }

    ;
}
