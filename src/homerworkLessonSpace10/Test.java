package homerworkLessonSpace10;

public class Test {
    public static void main(String[] args) {

        Exp kb = new Exp(12,"adana");

    }

    public static int randomNumber(int origin, int bound , java.util.Random rd){
        return rd.nextInt(bound - origin) + origin;
    }

    public static double randomDoubleNumber(int origin, int bound , java.util.Random rd){
        return rd.nextDouble() * (bound - origin) + origin;
    }
}

class Exp{


    String name;
    int age;

    public Exp(int x){
        //..
    }
    public Exp(int newAge, String newName){
        name = newName;
        age = newAge;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
