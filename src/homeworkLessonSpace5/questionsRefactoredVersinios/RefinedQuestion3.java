package homeworkLessonSpace5.questionsRefactoredVersinios;


public class RefinedQuestion3 {
    public static final double GRAVITY = 0.981;

    public static void main(String[] args) {
        run();
    }

    public static double calculateGaravity(int weight, String place) {
        double newtonVal = weight * GRAVITY;

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
            String place;
            int count = 5, weight;


            System.out.print("enter your want to compute place: ");
            while (true) {
                place = kb.next().trim();

                if (place.equalsIgnoreCase("exit"))
                    break EXIT_MAIN_LOOP;

                if (place.equalsIgnoreCase("moon") || place.equalsIgnoreCase("earth"))
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
            weight = kb.nextInt();

            displayGravity(weight, place);
        }
    }

    private static void run() {

        System.out.println("Welcome to calculater of weight2newton\nif you want to be exit just enter exit on place phase\n");

        inputLoop();

        System.out.println("thank your for using this app");
    }


}
