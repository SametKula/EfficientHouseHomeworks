package homeworkLessonSpace5.questionsRefactoredVersinios;

public class RefinedQuestion7 {

    public static void main(String[] args) {

        run();

    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("please enter your want to know to is it a amstrong number: ");
            int number = keyboard.nextInt();

            if (number == 0)
                break;

            boolean isAmstrong = isAmstrong(number);

            isAmstrongToDisplay(isAmstrong, number);
        }

        System.out.println("thank you for used this app");
    }


    public static void isAmstrongToDisplay(boolean isAmstrong, int number) {
        if (isAmstrong)
            System.out.printf("%d a amstrong number", number);
        else
            System.out.printf("%d not a amstrong number", number);
    }


    public static boolean isAmstrong(int number) {
        int sum = 0, temp = number;

        for (int j = 1; number > 0; number /= 10) {
            for (int i = 0; i < numberOfDigits(temp); i++)
                j *= number % 10;

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
