package Examples.Interfaces;

public class CreditCard implements PaymentMethod{
    public void pay(double amount){
        System.out.println(amount + " paid by credit card");
    }
}
