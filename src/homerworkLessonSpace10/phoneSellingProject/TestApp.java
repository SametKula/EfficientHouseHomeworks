package homerworkLessonSpace10.phoneSellingProject;

public class TestApp {
    public static void run() {
        Customer cs1 = new Customer("faruk", 2323);
        Customer cs2 = new Customer("berkecan", 10000, new Phone("Iphone saomi max pro hd galaksi", 2001, 0.9, 900));

        cs2.startPhone();

        cs1.phone = StoreFactory.takePhoneFromSomeone(cs2);

        StoreFactory.changePhone(cs1, cs2);


    }
}
