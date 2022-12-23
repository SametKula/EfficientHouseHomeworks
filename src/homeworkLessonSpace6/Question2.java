package homeworkLessonSpace6;

public class Question2 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        System.out.println(timeConverter(15000));
    }

    public static String timeConverter(long seconds){
        long minutes = seconds / 60;
        seconds = seconds %60;
        long hours = minutes / 60;
        minutes = minutes %60;


        return " time is :" + hours + " hour ," + minutes +" minutes ," +seconds + " second";


    }
}
