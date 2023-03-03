package homerworkLessonSpace10.phoneSellingProject;

public class App {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int q = kb.nextInt();
        String output = "";

        for(int i = 0; i < q; i++){
            int a = kb.nextInt(), b = kb.nextInt(), n = kb.nextInt();

            int previousResult = a;

            for(int j = 0; j < n; j++){
                previousResult += Math.pow(2,j) * b;
                output += previousResult + " ";
            }
            output += "\n";

        }

        System.out.println(output);
    }
}
