package homerworkLessonSpace10.basicShopping;

public class Customer {
    public String name;
    public Wallet wallet;
    public Phone phone;
    public String shoppingList;

    public Customer(String newName, Wallet newWallet, Phone newPhone, String newShoppingList) {
        name = newName;
        wallet = newWallet;
        phone = newPhone;
        shoppingList = newShoppingList;
    }

    public static void goToMarket(Customer customer) {
        Market.shopping(customer);
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Phone getPhone() {
        return phone;
    }

    public String getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(String newShoppingList) {
        shoppingList = newShoppingList;
    }

    public void addItemToShoppingList(String item) {
        item = item.trim();
        shoppingList = shoppingList.concat(item);
    }


}
