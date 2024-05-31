package Methods.assgn4;

import java.util.Scanner;

/**
 * Q2
 */
public class Q2 {

  public static int sumOfDigits(int a) {
    int sum = 0;

    while (a > 0) {
      sum += a % 10;
      a /= 10;
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number to find the sum of its digits---------->  :");
    int number = sc.nextInt();
    int sum=sumOfDigits(number);
    System.out.println("the sum of digits of "+number +" is "+sum);


  }
}
