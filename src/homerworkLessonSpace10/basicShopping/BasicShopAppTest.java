package homerworkLessonSpace10.basicShopping;

public class BasicShopAppTest {
    public static void run()
    {
        // Customer.goToMarket(new Customer("Eren", new Wallet(new Card("1234", 1000), 1000), new Phone("536 999 99 99")));
        Customer tarik = new Customer("tarik",
                            new Wallet(
                                new Card("1234",1000),
                                    1000),
                            new Phone("055555"),"1212122222222222222222222221111111111111111111111111111111111111111111111113333333333334555");


        Customer faruk = new Customer("faruk", new Wallet(new Card("4321",500),1500),new Phone("0444444"),"222222");

        faruk.phone.call(tarik,faruk);
    }
}
