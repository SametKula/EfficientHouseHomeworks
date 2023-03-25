package homerworkLessonSpace10.basicShopping;

public class Market {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);

    public static void displayProducts() {
        System.out.println("Products");
        System.out.println("--------------------");
        System.out.println("1- Milk - 10");
        System.out.println("2- Bread - 5");
        System.out.println("3- Egg - 7");
        System.out.println("4- Apple - 3");
        System.out.println("5- Newspaper - 2");
        System.out.println("0- '-End shopping -> Go to Payment'");
    }

    public static int getProduct() {
        String shoppingList = "";
        int count = 0;

        displayProducts();

        while (true) {
            int choice = Integer.parseInt(kb.nextLine());

            if (checkInput(choice))
                continue;

            shoppingList = shoppingList.concat(choice + "");

            if (choice == 0) {
                System.out.printf("-----------------------%n" +
                        "%d products - %d $" +
                        "%n-----------------------%n", count, getProduct(shoppingList));
                return getProduct(shoppingList);
            }
            count++;
        }


    }

    public static int getProduct(String shoppingList) {
        int cost = 0;
        for (int i = 0; i < shoppingList.length(); i++) {
            cost += getProductsCost(getShoppingListItemByNumber(i, shoppingList));
        }
        return cost;
    }

    public static int getShoppingListItemByNumber(int i, String shoppingList) {
        String item = shoppingList.substring(i, i + 1);

        return switch (item) {
            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            default -> 0;
        };
    }

    public static int getProductsCost(int product) {
        return switch (product) {
            case 1 -> 10;
            case 2 -> 5;
            case 3 -> 7;
            case 4 -> 3;
            case 5 -> 2;
            default -> 0;
        };
    }

    public static void shopping(Customer customer) {
        int cost;
        if (customer.getShoppingList().equals(""))
            cost = getProduct();
        else
            cost = getProduct(customer.getShoppingList());

        System.out.println(formatShoppingList(customer.getShoppingList()));


        System.out.println("How do you want to pay ? \n" +
                "Card ,Cash or QR");

        Wallet wallet = customer.getWallet();
        String paymentChoice = kb.nextLine();

        if (paymentChoice.equalsIgnoreCase("card"))
            paymentWithCard(wallet.getCard(), cost);
        else if (paymentChoice.equalsIgnoreCase("cash"))
            paymentWithCash(wallet, cost);
        else if (paymentChoice.equalsIgnoreCase("qr")) {

        } else
            System.out.println("Invalid Input");
    }

    public static void paymentWithCard(Card card, int cost) {
        for (int i = 3; 0 < i; i--) {
            System.out.print("password:");
            if (kb.nextLine().equals(card.getPassword())) {
                if (card.checkBalance(cost)) {
                    card.setBalance(card.getBalance() - cost);
                    System.out.println("Successfully Paid\n");
                    System.out.printf("Remaining Card Balance : %d", card.getBalance());
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            } else {
                System.out.printf("Wrong password - Your remaining left %d%n", i);
            }
        }
    }

    public static void paymentWithCash(Wallet wallet, int cost) {
        if (wallet.getCard().checkBalance(cost)) {
            wallet.setCashMoney(wallet.getCashMoney() - cost);
            System.out.println("Thanks for your choosing us");
            System.out.printf("New Balance : %d", wallet.getCashMoney());
        } else
            System.out.println("You did not give enough money");
    }
    public static void paymentWithQR(Wallet wallet, int cost){

    }


    public static boolean checkInput(int choice) {
        boolean flag = false;

        if (choice < 0 || choice > 5) {
            System.out.println("Invalid Input");
            flag = true;
        }

        return flag;
    }

    public static String formatShoppingList(String shoppingList) {
        int milk = 0, bread = 0, egg = 0, apple = 0, newspaper = 0;

        for (int i = 0; i < shoppingList.length(); i++) {
            switch (getShoppingListItemByNumber(i, shoppingList)) {
                case 1 -> milk++;
                case 2 -> bread++;
                case 3 -> egg++;
                case 4 -> apple++;
                case 5 -> newspaper++;
            }
        }

        return String.format("""
                Products & Costs
                ==========================================
                | Milk        %-27d|
                | Bread       %-27d|
                | Egg         %-27d|
                | Apple       %-27d|
                | Newspaper   %-26d+|
                |----------------------------------------|
                |             %d                        |
                ==========================================
                """, milk, bread, egg, apple, newspaper, getProduct(shoppingList));
    }
}
