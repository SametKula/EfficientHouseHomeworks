package homerworkLessonSpace10.phoneSellingProject;

public class Customer {
    public String name;
    public Phone phone;

    public void givePhoneToSomeone(Customer otherCustomer){
        otherCustomer.phone = phone;

        phone = null;
    }
}
