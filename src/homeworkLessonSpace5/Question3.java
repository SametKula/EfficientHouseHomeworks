package homeworkLessonSpace5;

public class Question3 {
    public static final double GRAVITY_VAR = 9.81;

    public static void main(String[] args) {
        newtonInputAndCalculate();
    }


    public static void newtonInputAndCalculate() {
        System.out.println("Welcome to calculater of weight2newton");
        inputLoop();


    }

    private static void inputLoop() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("enter your want to compute place: ");
        String input1 = kb.next();

        System.out.print("enter the thing weight: ");
        int input2 = kb.nextInt();

        displayGravity(input2, input1);
    }

    public static void displayGravity(int x, String y) {
        if (y.equalsIgnoreCase("earth") | y.equalsIgnoreCase("moon"))
            System.out.printf("%nyour newton on %s is : %.2f %n",y,calculateGaravity(x, y));
        else
            System.out.println("please enter moon or earth");
    }

    public static double calculateGaravity(int x, String y) {
        return (y.equalsIgnoreCase("moon") ? (GRAVITY_VAR * x) / 6 : GRAVITY_VAR * x)/10;
    }

}
