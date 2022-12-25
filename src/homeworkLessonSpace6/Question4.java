package homeworkLessonSpace6;

public class Question4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        starLeader(200, 20);
    }

    public static void starLeader(int height, int width) {
        boolean b = true;

        for (int count = 0, heightControl = 0; heightControl <= height; heightControl++) {
            int i = 0;

            System.out.print("/");

            for (; i < count; i++)
                System.out.print(" ");

            System.out.print("Efficent House");

            for (i += 2; i <= width; i++)
                System.out.print(" ");

            System.out.print("/\n");

            if (count == width - 1)
                b = false;
            if (count == 0)
                b = true;

            if (b)
                count++;
            else
                count--;

        }


    }
}
