package homeworkLessonSpace5.questionsRefactoredVersinios.lastestVersion;

public class Q4 {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("what your product's cost: ");
            double productCost = kb.nextDouble();

            System.out.print("what year you pass : ");
            int year = kb.nextInt();

            System.out.print("what think about inflation incrase : ");
            double inflation = kb.nextDouble() / 100;

            if (year == 0 || productCost == 0 || inflation == 0)
                break;

            double willCost = getCostUpByInflation(productCost, year, inflation);
            double willDoesntBuy = 100 * (willCost - productCost) / productCost;

            System.out.printf("the product geting %f on these years %d , and you dont buy %.0f ", willCost, year, willDoesntBuy);
        }

    }

    public static double getCostUpByInflation(double product, int year, double inflation) {
        while (year > 0) {
            product += product * inflation;
            year--;
        }

        return product;
    }
}
