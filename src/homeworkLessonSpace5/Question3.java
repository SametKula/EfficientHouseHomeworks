package homeworkLessonSpace5;

public class Question3 {
    public static final double GRAVITY_VAR = 9.81;

    public static void main(String[] args) {

    }


    public static void newtonInputAndCalculate() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("enter your want to compute place");
        String input = kb.next();

        System.out.print("enter the thing weight");
        int input2 = kb.nextInt();

        computeGravity(input2, input);


    }

    public static void computeGravity(int x, String y) {
        if (y.equalsIgnoreCase("earth"))
            ;
        else if (y.equalsIgnoreCase("moon"))
            ;
        else
            System.out.println("please enter moon or earth");

    }

    public static double computeGaravity(int x, String y) {
        return y.equalsIgnoreCase("moon") ? GRAVITY_VAR * x / 6 : GRAVITY_VAR * x;
    }

}
