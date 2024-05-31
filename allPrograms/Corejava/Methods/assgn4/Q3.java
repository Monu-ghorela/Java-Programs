package Methods.assgn4;

import java.util.Scanner;


public class Q3 {

  public static int productOfDigits(int a) {
    int product = 1;

    while (a > 0) {
      product *= a % 10;
      a /= 10;
    }

    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number to find the product of its digits---------->  :");
    int number = sc.nextInt();
    int product=productOfDigits(number);
    System.out.println("the product of digits of "+number +" is "+product);


  }
}
