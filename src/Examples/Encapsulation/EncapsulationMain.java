package Examples.Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        //Java - Encapsulation
        BankAccount account = new BankAccount("Ivan", 100);

        System.out.println(account.getOwnerName());
        System.out.println(account.getBalance());

        account.deposit(200);
        System.out.println(account.getBalance());

        account.setOwnerName("Denys");
        System.out.println(account.getOwnerName());

    }

}