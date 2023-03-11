package homerworkLessonSpace10;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://dummyjson.com/products/1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");

            // you can use one of these methods to get the results
            connection.connect();
            System.out.println(connection.getResponseCode());
            //System.out.println(connection.getInputStream().toString());
            System.out.println(connection.getOutputStream().toString());


// close the connection
            connection.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


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
