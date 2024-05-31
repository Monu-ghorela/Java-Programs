package Methods.assgn4;

import java.util.Scanner;

public class Q7 {

  public static int factorial(int a) {
    ///--by looping method
    // int fact = a;
    // for (int i = 1; i < a; i++) {
    //     fact*=i;
    // }

    ///by recursion
    if (a <= 0) {
      return 1;
    }
    return a * factorial(a - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "enter a number to find the facrial of the number---------->  :"
    );
    int number = sc.nextInt();
    int factorial = factorial(number);
    System.out.println("the factorial of " + number + " is " + factorial);
  }
}
