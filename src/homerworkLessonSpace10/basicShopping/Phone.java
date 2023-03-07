package homerworkLessonSpace10.basicShopping;
public class Phone {
    public String phoneNumber;

    Phone(String newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void call(Customer customer)
    {
        System.out.printf("(%s) - (%s) calling... %n", customer.getName(), customer.getPhone().getPhoneNumber());
    }
}
