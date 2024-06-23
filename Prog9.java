package LabProgs;
import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return("My Exception of Object The marks can't be less than 40 ");
    }
}
class Student1 {
    int id,m1,m2,m3;
    String name;

   void avgmark() {
        Scanner sc=new Scanner(System.in);
        try {
        System.out.println("Student ID:");
        id=sc.nextInt();
        System.out.println("Student Name:");
        name=sc.next();
        System.out.println("Mark1:");
        m1=sc.nextInt();
        System.out.println("Mark2:");
        m2=sc.nextInt();
        System.out.println("Mark3:");
        m3=sc.nextInt();
        if(m1<40 || m2<40 || m3<40)
        throw new MyException();
        System.out.println("Avg Score is:"+(m1+m2+m3)/3);
        }
        catch(MyException e) {
            System.out.println("Exception caught"+e);
        }
    }
}

public class Prog9 {
        public static void main(String[] args) {
            Student1 ob1=new Student1();
            ob1.avgmark();
            Student1 ob2=new Student1();
            ob2.avgmark();
        }    
}
