package homeworkLessonSpace5.questionsRefactoredVersinios.lastestVersion;

public class Q2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        String sum = "", preveiusLetter = " ";

        System.out.println("enter only r g b letters");
        while (sum.length() < 5) {
            System.out.print("enter a letter :");
            String input = kb.next().trim().toUpperCase();

            if (input.equals("R") || input.equals("G") || input.equals("B")) {
                if (!input.equals(preveiusLetter)) {
                    sum = sum.concat(input);
                    preveiusLetter = input;
                } else
                    System.out.println("dont use previous one");
            } else
                System.out.println("please enter just r g b letters");
        }

        System.out.printf("your pattern is %s ", sum);
    }


}
