package homerworkLessonSpace10.basicShopping;
public class Card {
    public String password;
    public int balance;

    public Card(String newPassword, int newBalance)
    {
        password = newPassword;
        balance = newBalance;
    }

    public String getPassword()
    {
        return password;
    }

    public void setBalance(int newBalance)
    {
        balance = newBalance;
    }

    public int getBalance()
    {
        return balance;
    }

    public boolean checkBalance(int costingMoney){
        return getBalance() >= costingMoney;
    }
}
