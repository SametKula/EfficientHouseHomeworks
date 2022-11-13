package homeworkLessonSpace5.questionsRefactoredVersinios;

public class RefinedQuestion6 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("welcome to population calculator (if you want to exit enter 0 in any phase)");
        while (true) {
            System.out.print("enter your days: ");
            int days = kb.nextInt();

            System.out.print("enter your entity's size: ");
            int size = kb.nextInt();

            if (size == 0 | days == 0)
                break;


            displayIncrasePopulation(days, size);
        }

        System.out.println("thanks for using this app <3");
    }

    public static void displayIncrasePopulation(int willPassDays, int size) {
        int populationSize = populationIncraseLoop(willPassDays, size);

        System.out.printf("your poplation become will %d pound", populationSize);
    }

    public static int populationIncraseLoop(int days, int size) {
        int a1 = 1, a2 = 1, i = 1;

        while (days / 5 > i) {
            int a3 = a1 + a2;

            a1 = a2;
            a2 = a3;
            i++;
        }

        return a2 * size;
    }


}
