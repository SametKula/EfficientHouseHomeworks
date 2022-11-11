package homeworkLessonSpace5.questionsRefactoredVersinios;

public class RefinedQuestion4 {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("welcome to inflation incrase computer app\n(if you want exit enter 0 on any phase and end the input section this make the app end)");

        while (true) {
            System.out.print("what your product's cost : ");
            double productCost = kb.nextDouble();

            System.out.print("what year you pass : ");
            int year = kb.nextInt();

            System.out.print("what think about inflation incrase : ");
            double inflation = kb.nextDouble() / 100;

            if (year == 0 || productCost == 0 || inflation == 0)
                break;

            double willCost = getCostUpByInflation(productCost, year, inflation);
            double willDoesntBuy = 100 * (willCost - productCost) / productCost;

            displayInflation(year, willCost, willDoesntBuy);
        }


        System.out.println("thank you for used this app <3");

    }

    private static void displayInflation(int year, double willCost, double willDoesntBuy) {
        System.out.printf("your product will be %.2f and your company %d year later doesn't buy %.0f of 100 product product ", willCost, year, willDoesntBuy);
    }


    public static double getCostUpByInflation(double product, int year, double inflation) {
        while (year > 0) {
            product += product * inflation;
            year--;
        }

        return product;
    }
}
