package homerworkLessonSpace10.basicShopping;

public class Customer {
    public String id;
    public String password;
    public String name;
    public Wallet wallet;
    public Phone phone;
    public String shoppingList;

    public Customer(String newId, String newPassword ,String newName, Wallet newWallet, Phone newPhone, String newShoppingList) {
        id = newId;
        password = newPassword;
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
    public String getId(){
        return id;
    }
    public void setId(String newId){
        id = newId;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String newPassword){
        id = newPassword;
    }


}
