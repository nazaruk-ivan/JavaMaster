package Examples.Interfaces;

public class Paypal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by Paypal");
    }
}
