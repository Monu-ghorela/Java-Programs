package Arrays;

import java.util.Scanner;

public class Ar1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("{enter a size for array}");
    int size = sc.nextInt();

    ////--------kind of decalaration

    // int arr[] = new int[size];
    int [] arr=new int[size];

    System.out.println("enter the elemnets for array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
