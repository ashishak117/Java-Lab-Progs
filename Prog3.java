package LabProgs;

public class Prog3 {
    public static void main(String args[]){
    Student ob1=new Student();
    ob1.print();
    Student ob2=new Student(1002,"Rohan",22);
    ob2.print();

    Geo obj=new Geo();
    obj.calarea(10.0f);
    obj.calarea(50.5f,25.5f);
}
}