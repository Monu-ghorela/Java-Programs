package Methods.assgn4;

import java.util.Scanner;

public class Q5 {

  public static int CountOfDigits(int a) {
    int Count = 0;

    while (a > 0) {
      Count++;
      a /= 10;
    }

    return Count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "enter a number to find the Count of its digits---------->  :"
    );
    int number = sc.nextInt();

    int Count = CountOfDigits(number);
    System.out.println("the Count of digits of " + number + " is " + Count);
  }
}
