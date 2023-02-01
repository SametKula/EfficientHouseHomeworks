package homeworkLessonSpace8;

public class PrintThings <T>{
    public T printThing;

    public PrintThings(T variable){
        printThing = variable;
    }

    public void print(){
        System.out.println("your value is : " + printThing);
    }

}
