package homeworkLessonSpace5;

public class Question5 {
    //public static final double BANK_COST = 15/1000;


    public static void main(String[] args) {
        run();
    }

    public static void run(){
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("welcome to depth pay month app");

        System.out.print("what is your product's price");
        double input1 = kb.nextDouble();

        System.out.print("what is your able to pay");
        int input2 = kb.nextInt();


        displayDepthMonth(input1, input2);
    }

    public static void displayDepthMonth(double productPrice , int whatCanYouPaid){
        if (willPassedMonth(productPrice,whatCanYouPaid) == 0) {
            System.out.println("your money doesn't enoungh for this product");
            return;
        }
        System.out.printf("%nyour paid mounths are pass %d month and after your depth is done %n", willPassedMonth(productPrice,whatCanYouPaid));
    }

    public static int willPassedMonth(double x, int z) {
        if (z - ((x / 1000) * 15) < 0)
            return 0;

        int y = 1;
        for (double temp = 0; x - temp > 0; x -= temp, y++)
            temp = z - ((x / 1000) * 15);


        return y;
    }
}

