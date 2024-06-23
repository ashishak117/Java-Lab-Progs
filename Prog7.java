package LabProgs;
import java.util.Scanner;
public class Prog7 {
    public static void main(String args[]) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Deposit Amount:");
        int depo=sc.nextInt();
        Account a1=new Account(depo);
        Jointacc party1=new Jointacc(a1);
        Thread t1=new Thread(party1);
        t1.start();
        t1.join();
        Jointacc party2=new Jointacc(a1);
        Thread t2=new Thread(party1);
        t2.start();
    }
    
}
