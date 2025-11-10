package Examples.Encapsulation;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void setOwnerName(String newName){
        this.ownerName = newName;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        this.balance += amount;
        System.out.println(amount + " added. New balance: " + this.balance);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        if(this.balance < amount){
            System.out.println("Not enough balance");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " withdrawn. New balance: " + this.balance);
    }
}