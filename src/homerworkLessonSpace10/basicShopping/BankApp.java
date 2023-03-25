package homerworkLessonSpace10.basicShopping;

public class BankApp {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);
    public static Customer customer;
    public int temporaryCost;

    public void login(Customer newCustomer) {
        customer = newCustomer;

        for (int i = 2; i >= 0; i--) {
            System.out.print("Customer Id: ");
            String inputId = kb.nextLine();

            System.out.print("Password: ");
            String inputPassword = kb.nextLine();

            if (loginCheck(inputId, inputPassword)) {
                System.out.println("-------------------");
                System.out.println("Login successfully");
                System.out.println("-------------------");
                menu();
                break;
            } else
                System.out.printf("Wrong id or password. Remaining left: %d%n", i);
        }
    }

    public boolean loginCheck(String inputId, String inputPw) {
        return customer.getId().equals(inputId) && customer.getPassword().equals(inputPw);
    }

    public void menu() {
        for (; ; ) {
            displayMenu();

            String choice = kb.nextLine();
            menuOptions(choice);

            if (choice.equals("0"))
                break;
        }
    }

    public void displayMenu() {
        System.out.println("1- Show Balance\n" +
                "2- exchange\n" +
                "3- Deposit\n" +
                "4- qr payment\n" +
                "0- Exit\n" +
                "-------------------");
    }

    public void menuOptions(String choice) {
        switch (choice) {
            case "0":
                System.out.println("Exiting menu");
                break;
            case "1":
                showBalance();
                break;
            case "2":
                exchange();
                break;
            case "3":
                deposit();
                break;
            case "4":
                qrPayment();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public void showBalance() {
        System.out.printf("Balance: %d%n", customer.getWallet().getCard().getBalance());
    }

    public void exchange() {
        Card sender = customer.getWallet().getCard();

        System.out.println("Iban: ");
        Card receiver = new Card("1234", 1000);

        System.out.println("How much to want to send:");
        int toSendMoney = Integer.parseInt(kb.nextLine());

        exchange(sender, receiver, toSendMoney);

    }
    public void exchange(Card sender, Card receiver, int toSendMoney){
        if (sender.checkBalance(toSendMoney)) {
            sender.setBalance(sender.getBalance() - toSendMoney);
            receiver.setBalance(receiver.getBalance() + toSendMoney);
            System.out.println("Your transaction is completed successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void qrPayment(){
        if (getTemporaryCost() == 0)
            System.out.println("there is no qr");
        else
            exchange(customer.getWallet().getCard(),new Card("1234",1000),getTemporaryCost());
        setTemporaryCost(0);
    }
    public void setTemporaryCost(int newTemporaryCost){
        temporaryCost = newTemporaryCost;
    }
    public int getTemporaryCost(){
        return temporaryCost;
    }

    public void deposit() {
        System.out.println("How much do you want to deposit");
        int amount = Integer.parseInt(kb.nextLine());

        Wallet wallet = customer.getWallet();
        Card card = wallet.getCard();

        card.setBalance(card.getBalance() + amount);
        wallet.setCashMoney(wallet.getCashMoney() - amount);
    }
}