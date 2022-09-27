package homeworkLessonSpace1;

public class Main {
    public static void main(String[] args) {
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        {
            //contains
            //istenilen string'i istenilen string içinde varmı kontrol ediyor döndürdüğü ise sadece boolean true ve false'dır
            String str = "trrrrum, trrrrum , trak tiki tak makinalaşmak istiyorum!";
            String bulmakIstenilen = "trak";
            System.out.println(str.contains(bulmakIstenilen) ? "bulmak istenilen string var" : "bulmak istenilen yok");
        }
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        {
            //compareTo
            //istenilen string'i istenilen string'e alfabeye göre karşılaştırmasını yapar ve int değer döndürür
            String str1 = "a";
            String str2 = "c";
            System.out.println(str1.compareTo(str2));


        }
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        {
            //concat
            //istenilen iki string'i birleştirir ve birleştirilmiş stringi yeni nesne olarak verir
            String str1 = "hello ";
            String str2 = "World!";
            System.out.println(str1.concat(str2));
        }
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        {
            //substring
            //verilen string'in istenen değer aralıklarını yeni nesne olarak verir
            String str1 = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborumnumquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentiumoptio";
            System.out.println(str1.substring(0,12));
        }
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        /*consolda görünen değer
        ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
        bulmak istenilen string var
        ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
        -2
        ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
        hello World!
        ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
        Lorem ipsum
        ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬*/

    }




}



