package homeworkLessonSpace4;

public class HomeworkSpace2 {
    public static void main(String[] args) {

        run();
    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("please enter your want to know to is it a prime number: ");
        //long input = keyboard.nextLong();

        System.out.println("");

        for (int input = 1; input < 30; input++)
            System.out.printf("%d. prime number is %d %n",input,getPrimeIndex(input));
            /*if (isPrime(input))
                System.out.printf("%d is %d. prime number%n",input,getPrime(input));
            else
                System.out.printf("%d not a prime number%n",input);*/



    }

    public static boolean isPrime(long x) {
        if (x % 2 == 0)
            return x == 2;

        if (x <= 1 )
            return false;

        for (long i = 3; i * i <= x ; i += 2)
            if (x % i == 0)
                return false;

        return true;
    }

    public static int getPrime(long x){
        int count = 1;

        for (int i = 1; i <= x ; i+=2)
            if (isPrime(i))
                count++;

        return count;
    }

    public static long getPrimeIndex(int x ){
        long temp ;

        for (int i = 1 ; ; i += 2)
            if (getPrime(i) == x){
                temp = i;
                break;
            }

        return temp;
    }

    public static void isPrimeToDisplay(boolean b, long x) {
        if (b)
            System.out.println(x + " is a Prime number ");
        else
            System.out.println(x + " is not a Prime number");
    }
}
