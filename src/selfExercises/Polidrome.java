package selfExercises;

public class Polidrome {
    public static void main(String[] args) {
        for (int i = 10;i < 100; i++)
            System.out.printf("%d sayısı %d kere döner.%n",i,PolidromeUtil.countPolidrome(i));
    }
}
class PolidromeUtil {
    public static int countPolidrome(int number){
        long temp = number ;
        int count = 1;
        while (!isPolidrome(temp)){
            count++;
            temp = beforePalidrome(temp);
        }

        return count;
    }

    public static boolean isPolidrome(long number){
        long palidromedNumber = beforePalidrome(number);

        return reverseNumber(palidromedNumber) == palidromedNumber;
    }
    public static long beforePalidrome(long number){
        return number + reverseNumber(number);
    }
    public static long reverseNumber(long x){
        long result = 0;

        for (;x > 0 ; x /= 10) {
            result += x % 10;
            result *= 10;
        }
        return result/10;
    }

}
class PolidromeUsage {
    long number;
    int count;
}
