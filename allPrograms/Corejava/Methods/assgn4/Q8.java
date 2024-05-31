package Methods.assgn4;

import java.util.Scanner;

public class Q8 {

  public static int powerOfNumber(int base, int power) {
    int realPower = base;
    for (int i = 1; i < power; i++) {
      realPower *= base;
    }
    return realPower;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "enter a number to find the power of  number ---------->  :"
    );
    int base = sc.nextInt();
    System.out.println();
    System.out.print(
      "enter a power of base to find the power of  number ---------->  :"
    );

    int power = sc.nextInt();

    int powerOfNumber = powerOfNumber(base, power);
    System.out.println("the power of  of " + base + " is " + powerOfNumber);
  }
}
