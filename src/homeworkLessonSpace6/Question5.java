package homeworkLessonSpace6;

public class Question5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(toplamAsallari(10002));
    }

    public static String toplamAsallari(int x) {
        if (x % 2 != 0)
            return "çift sayi gir";
        if (x <= 4)
            return x == 4 ? "|| 2 + 2" : "daha büyük sayı girin";

        String sumrary = "";

        for (int i = 3; i <= x / 2; i += 2) {
            if (!isPrime(i))
                continue;
            for (int j = x - 3; j >= x / 2; j -= 2) {
                if (!isPrime(j))
                    continue;
                if (i + j == x)
                    sumrary = sumrary.concat("||" + i + "+" + j);
            }


        }
        return sumrary;
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
