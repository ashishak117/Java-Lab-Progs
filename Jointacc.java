package LabProgs;
import java.util.Scanner;
public class Jointacc implements Runnable {
    Account account;
    public Jointacc(Account account) {
        this.account=account;
    }
    public void run() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Withdrawl amount: ");
        int with=sc.nextInt();
        account.withdraw(with);
    }
}
