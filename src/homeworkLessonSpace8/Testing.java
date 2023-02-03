package homeworkLessonSpace8;



public class Testing {
    public static void run() {
        java.util.Random rd = new java.util.Random();

        rd.setSeed(10);

        for (int i = 0; i < 6; i++)
            System.out.print(rd.nextInt(9) + 1);



    }

}
