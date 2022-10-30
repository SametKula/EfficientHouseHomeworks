package homeworkLessonSpace4;

public class HomeworkSpace2 {
    public static void main(String[] args) {

        run();
    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("please enter your want to know to is it a prime number: ");
        //long input = keyboard.nextLong();


        for (int input = 0; input<100; input++)
            isPrimeToDisplay(isPrime(input), input);



    }

    public static boolean isPrime(long x) {
        if (x <= 1)
            return false;

        if (x % 2 == 0)
            return false;

        for (long i = 3; i < x / 2; i += 2)
            if (x % i == 0)
                return false;

        return true;
    }

    public static void isPrimeToDisplay(boolean b, long x) {
        if (b)
            System.out.println(x + " is a Prime number ");
        else
            System.out.println(x + " is not a Prime number");
    }
}
