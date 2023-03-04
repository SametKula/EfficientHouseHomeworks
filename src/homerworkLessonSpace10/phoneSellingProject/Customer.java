package homerworkLessonSpace10.phoneSellingProject;

public class Customer {
    public String name;
    public int money;
    public Phone phone;
    public Customer(String newName, int newMoney ,Phone newPhone){
        name = newName;
        money = newMoney;
        phone = newPhone;
    }
    public Customer(String newName, int newMoney ){
        name = newName;
        money = newMoney;
    }

    public void givePhoneToSomeone(Customer otherCustomer){
        otherCustomer.phone = phone;

        phone = null;
    }
}
