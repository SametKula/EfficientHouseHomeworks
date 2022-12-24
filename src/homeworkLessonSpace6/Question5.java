package homeworkLessonSpace6;

public class Question5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

    }

    public static String toplamAsallari(int x) {
        if (x % 2 != 0)
            return "çift sayi gir";
        if (x < 4)
            return "daha büyük sayı girin";

        for (int a = 3, b = x - 1; a < b; a += 2, b-=2){


        }

            return " ";
    }

    public static boolean isPrime(int x) {
        if (x % 2 == 0)
            return x == 2;

        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0)
                return false;

        return x > 1;
    }


}
