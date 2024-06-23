package LabProgs;

public class Student {
    int id,age;
    String name;
    Student() {
        id=1001;
        name="Ashish";
        age=22;
    }
    Student(int num1,String str,int num2) {
        id=num1;
        name=str;
        age=num2;
    }
   public void print() {
        System.out.println("Student ID:"+id);
        System.out.println("Student Name:"+name);
        System.out.println("Student age:"+age);
    }
}
