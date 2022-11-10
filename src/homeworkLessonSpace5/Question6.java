package homeworkLessonSpace5;

public class Question6 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("welcome to population calculator (if you want to exit enter 0)");
        while(true){
            System.out.print("enter your days: ");
            int days = kb.nextInt();

            System.out.print("enter your entity's size: ");
            int size = kb.nextInt();

            if (size == 0 | days == 0){
                System.out.println("thanks for using this app <3");
                break;
            }


            displayIncrasePopulation(days , size);
        }
    }

    public static void displayIncrasePopulation(int loopTimes , int size) {
        int populationSize = populationIncraseLoop(loopTimes,size);

        System.out.printf("your poplation become will %d pound", populationSize);
    }

    public static int populationIncraseLoop(int days , int size) {
        int a1 = 1, a2 = 1;

        for (int i = 1; days/5 > i ; i++) {
            int a3 = a1 + a2;

            a1 = a2;
            a2 = a3;
        }

        return a2 * size;
    }
}
