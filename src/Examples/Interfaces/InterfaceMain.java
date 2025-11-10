package Examples.Interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        //Java - Interfaces
        CreditCard card1 = new CreditCard();
        card1.pay(100);

        Paypal paypal1 = new Paypal();
        paypal1.pay(135);

    }

}