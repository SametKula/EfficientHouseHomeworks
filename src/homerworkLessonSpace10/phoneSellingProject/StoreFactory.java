package homerworkLessonSpace10.phoneSellingProject;

public class StoreFactory {
    public static Phone takePhoneFromSomeone(Customer phoneOwner){
        Phone thePhone = phoneOwner.phone;
        phoneOwner.phone = null;
        return thePhone;
    }
    public static void changePhone(Customer cst1, Customer cst2){
        Phone secondsPhone = cst2.phone;
        cst2.phone = cst1.phone;
        cst1.phone = secondsPhone;
    }
}
