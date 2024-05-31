package Methods.assgn4;

import java.util.Scanner;


public class Q6 {

  public static void display(int a, int n) {
    System.out.println("the factor of the nnumber " + n + " is " + a);
  }

  public static void factorOfNumber(int a) {
    for (int i = 1; i <= a; i++) {
      if (a % i == 0) {
        display(i, a);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "enter a number to find the factor the number ---------->  :"
    );
    int number = sc.nextInt();
    factorOfNumber(number);
  }
}
