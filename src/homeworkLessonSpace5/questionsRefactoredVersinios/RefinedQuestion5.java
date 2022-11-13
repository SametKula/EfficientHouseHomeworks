package homeworkLessonSpace5.questionsRefactoredVersinios;

public class RefinedQuestion5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("welcome to bank pay system calculator app\nif you want to exit enter 0 and end input phase");

        while (true) {
            System.out.println("welcome to depth pay month app");

            System.out.print("what is your product's price");
            double productCost = kb.nextDouble();

            System.out.print("what is your able to pay");
            int ableToPay = kb.nextInt();

            if (productCost == 0 || ableToPay == 0)
                break;

            displayDepthMonth(productCost, ableToPay);
        }
    }

    public static void displayDepthMonth(double productPrice, int whatCanYouPaid) {
        int willPassMonth = willPassedMonth(productPrice, whatCanYouPaid);
        boolean payable = willPassMonth == 0;

        if (payable) {
            System.out.println("your money doesn't enoungh for this product");
            return;
        }

        System.out.printf("%nyour paid mounths are pass %d month and after your depth is done %n", willPassMonth);
    }

    public static int willPassedMonth(double productDepth, int payableMoney) {
        double bankPay = 0.015;

        if (0 > payableMoney - productDepth * bankPay)
            return 0;

        int month = 1;
        while (productDepth > payableMoney) {
            productDepth -= payableMoney - productDepth * bankPay;
            month++;
        }

        return month;
    }
}
