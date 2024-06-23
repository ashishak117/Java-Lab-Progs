package LabProgs;
import java.util.Scanner;
public class Emp {
    int empno;
    String empname;
    float salary,hra,da,it,gp;
    Emp() {
        empno=0;
        empname="";
        salary=0.0f;
        hra=0.0f;
        da=0.0f;
        it=0.0f;
        gp=0.0f;
    }
    void getdata() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the Emp no:");
        empno=sc.nextInt();
        System.out.println("Enter The Emp Name:");
        empname=sc.next();
        System.out.println("Enter The Basic Salary:");
        salary=sc.nextFloat();
    }
    void cal() {
        hra=salary*0.1f;
        da=salary*0.555f;
        it=salary*0.06f;
        gp=salary+hra+da-it;
    }
    void display() {
        System.out.println("------------------------------------------------------");
        System.out.println("----------------------Emp Details---------------------");
        System.out.println("Emp No: "+empno);
        System.out.println("Emp Name: "+empname);
        System.out.println("Salary: "+salary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("IT: "+it);
        System.out.println("GP: "+gp);
        System.out.println("-------------------------------------------------------");
    }
}
