package LabProgs;

public class Account {
    private int balance;
    public Account(int amount) {
        System.out.println("Available Balance: "+amount);
        balance=amount;
    }
    public synchronized void withdraw(int amount) {
        if(amount>balance) {
            System.out.println("Insufficent Balance!!");
        }
        else
            balance=balance-amount;
            System.out.println("Remaining balance: "+balance);
    }
}
