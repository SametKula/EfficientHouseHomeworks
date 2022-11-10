package homeworkLessonSpace5.questionsRefactoredVersinios;


public class RefinedQuestion3 {
    public static final double GRAVITY = 9.81;

    public static void main(String[] args) {
        run();
    }

    public static double calculateGaravity(int val, String place) {
        double newtonVal = val * GRAVITY / 10;

        if (place.equalsIgnoreCase("moon"))
            return newtonVal / 6;

        return newtonVal;
    }

    public static void displayGravity(int val, String place) {
        System.out.printf("%nyour newton on %s is : %.2f %n%n", place.toLowerCase(), calculateGaravity(val, place));

    }

    private static void inputLoop() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        EXIT_MAIN_LOOP:
        while (true) {
            System.out.print("enter your want to compute place: ");
            String input1;
            int count = 5;


            while (true) {
                input1 = kb.next().trim();

                if (input1.equalsIgnoreCase("exit"))
                    break EXIT_MAIN_LOOP;

                if (input1.equalsIgnoreCase("moon") || input1.equalsIgnoreCase("earth"))
                    break;

                System.out.println("please enter moon or earth");

                count--;
                if (count == 0) {
                    System.out.println("\nif you want exit just enter exit\n");
                    count += 5;
                }

                System.out.print("enter your want to compute place: ");

            }

            System.out.print("enter the thing weight: ");
            int input2 = kb.nextInt();

            displayGravity(input2, input1);
        }
    }

    private static void run() {

        System.out.println("Welcome to calculater of weight2newton\nif you want to be exit just enter exit on place phase\n");

        inputLoop();

        System.out.println("thank your for using this app");
    }


}
