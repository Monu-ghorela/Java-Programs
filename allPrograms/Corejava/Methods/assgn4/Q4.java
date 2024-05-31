package Methods.assgn4;

import java.util.Scanner;

public class Q4 {

  public static boolean isEven(int a) {
    if (a % 2 == 0) {
      return true;
    }
    return false;
  }

  public static int sumOfEvenDigits(int a) {
    int sum = 0;

    while (a > 0) {
      if (isEven((a % 10))) {
        sum += a % 10;
      }
      a /= 10;
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "enter a number to find the sum of its even digits---------->  :"
    );
    int number = sc.nextInt();
    int sum = sumOfEvenDigits(number);
    System.out.println("the sum of even digits of " + number + " is " + sum);
  }
}
