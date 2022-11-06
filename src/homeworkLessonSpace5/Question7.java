package homeworkLessonSpace5;

public class Question7 {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("please enter your want to know to is it a amstrong number: ");
        int input = keyboard.nextInt();

        isAmstrongToDisplay(isAmstrong(input));
    }


    public static void isAmstrongToDisplay(boolean x) {
        if (x)
            System.out.println("this number is a amstrong number");
        else
            System.out.println("this number is not a amstrong number");
    }


    public static boolean isAmstrong(int x) {
        int sum = 0, temp = x, j;

        for (; x > 0; x /= 10) {
            j = 1;

            for (int i = 0; i < numberOfDigits(temp); i++)
                j *= x % 10;

            sum += j;
        }
        return sum == temp;
    }


    public static int numberOfDigits(int x) {
        int digits = 0;

        for (; x > 0; x /= 10)
            digits++;

        return digits;
    }
}
