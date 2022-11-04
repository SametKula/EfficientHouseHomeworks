package homeworkLessonSpace5;

public class Question4 {

    public static final double INFLATION = 0.056;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        infilationCalculator();

    }

    public static void infilationCalculator() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("what your product's cost :");
        double x = kb.nextDouble();

        System.out.print("what year you pass :");
        int y = kb.nextInt();

        System.out.printf("your product will be %.2f and your company %d later doesn't buy %.0f of 100 product product ", getCostUpByInflation(x, y), y, ((getCostUpByInflation(x, y) * 100) - (x * 100)) / x);


    }


    public static double getCostUpByInflation(double x, int y) {
        for (; y > 0; y--, x += x * INFLATION) ;

        return x;
    }
}
