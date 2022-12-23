package homeworkLessonSpace6;

public class Question3 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        System.out.println(asalCarpanlari(5451210));
    }
    public static String asalCarpanlari(int x ){
        String result = "asal carpanlari : ";
        int i = 2 , temp = x;
        while(i <= temp) {
            if (x % i == 0){
                result = result.concat(i + " ");
                x /= i;
            }else {
                i++;
            }
            System.out.println(i);
        }

        return result;
    }
}
