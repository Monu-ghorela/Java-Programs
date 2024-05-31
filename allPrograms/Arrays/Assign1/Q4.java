package Assign1;

import java.util.Scanner;

public class Q4 {
public static boolean isprime(int n){
for (int i = 2; i <n; i++) {
    if(n==2){
        return true;
    }
   
   if(n%i==0){
    return true;
   } 
}
return false;
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("enter the elements ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("the prime elements in the array");
    for (int i = 0; i < arr.length; i++) {
    //    isprime(arr[i]);
       if (isprime(arr[i])==false&&arr[i]!=1) {
        System.out.println(arr[i]);
       }
    }
  }
}
