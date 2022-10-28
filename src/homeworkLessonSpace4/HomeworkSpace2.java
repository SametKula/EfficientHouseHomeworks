package homeworkLessonSpace4;

public class HomeworkSpace2 {
    public static void main(String[] args) {

        run();
    }
    public static void run(){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("please enter your want to know to is it a prime number: ");
        int input = keyboard.nextInt();


        isPrimeToDisplay(isPrime(input));

    }
    public static boolean isPrime(int x ){

        for (int i = x - 1; i > 1; i--)
            if (x % i == 0 )
                return false;

        return true;
    }
    public static void isPrimeToDisplay(boolean x) {
        if (x)
            System.out.println("this number is a Prime number");
        else
            System.out.println("this number is not a Prime number");
    }
}
