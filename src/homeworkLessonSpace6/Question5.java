package homeworkLessonSpace6;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println((int)(Math.log10(1332323) + 1));
    }


    public static void printCool(String str) throws InterruptedException {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            for (int ch = 30; ch != str.charAt(i); ch++) {
                System.out.print(sb.toString() + (char) ch);
                System.out.println();
                Thread.sleep(5);
            }
            sb.append(str.charAt(i));
            System.out.println(sb);
        }
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
