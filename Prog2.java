package LabProgs;
import java.util.Scanner;
public class Prog2 {
    Scanner sc=new Scanner(System.in);
   int[] inputarray() {
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int[] input=new int[n];
    for(int i=0;i<n;i++) {
    System.out.println("Enter the Element"+(i+1));
    input[i]=sc.nextInt();
   }
   return input;
   }
   void bubblesort(int arr[]) {
    int n=arr.length;
    for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
            if(arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
   } 
   void printarray(int arr[]) {
    int n=arr.length;
    System.out.println("Sorted Array are:");
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+"\t");
        // System.out.println();
   }
   public static void  main(String args[]) {
    Prog2 ob=new Prog2();
    int a[]=ob.inputarray();
    ob.bubblesort(a);
    
    ob.printarray(a);
   }
}
