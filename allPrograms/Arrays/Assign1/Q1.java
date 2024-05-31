package Assign1;

import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size = sc.nextInt();
    int[] a = new int[size];

    int sum = 0;
    System.out.println("enter the elemnt os the array");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println();
    for (int i = 0; i < a.length; i++) {
        sum+=a[i];
    }
        System.out.println(sum);
    double avg=sum/a.length;
    System.out.println(avg);
  }
}
