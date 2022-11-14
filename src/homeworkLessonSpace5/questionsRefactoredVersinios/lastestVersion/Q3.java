package homeworkLessonSpace5.questionsRefactoredVersinios.lastestVersion;

public class Q3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while(true) {
            System.out.print("enter place (use only earth or moon):");
            String place = kb.next().trim().toLowerCase();

            if (!place.equals("moon") & !place.equals("earth"))
                break;

            System.out.print("enter car's mass :");
            double mass = kb.nextDouble();

            System.out.printf("your weight is %.2fN on %s%n",massToWeight(place,mass),place);
        }
    }

    public static double massToWeight(String place ,double mass) {
        double gravity = 9.81;

        if (place.equals("moon"))
            return mass * gravity / 6;

        return mass * gravity;
    }
}
