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

    public void call(Customer friend , Customer owner)
    {
        System.out.printf("(%s) - (%s) calling... %n", owner.getName(), friend.getPhone().getPhoneNumber());

        System.out.printf("Hello %s can you buy me a few items please\nyeah why not sent me your shopping list and I but them for you\nok then I sent it after it\n",friend.getName());

        System.out.printf("friend's shop list is \n%s\n",Market.formatShoppingList(friend.getShoppingList()));

        if (friend.getShoppingList().equals(""))
            System.out.println("your friend send nothing so you may buy whatever you want");

        owner.setShoppingList(friend.getShoppingList());

        Market.shopping(owner);
    }
}
