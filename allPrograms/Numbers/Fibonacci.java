package Numbers;

import java.io.FileNotFoundException;

public class Fibonacci {

  public static void main(String[] args) {
    int first = 0;
    int second = 1;
    int fibonacci = 0;

    int n = 10;
    // nth no of fibonacci series

    // if (n == 1) {
    //   System.out.println(first);
    // } else if (n == 2) {
    //   System.out.println(second);
    // } else {
    //   while (n > 2) {
    //     fibonacci = first + second;
    //     first = second;
    //     second = fibonacci;

    //     n--;
    //   }
    //   System.out.println(fibonacci);
    // }

    //// print series

    System.out.println(first);
    System.out.println(second);
    while (n > 2) {
      fibonacci = first + second;
      first = second;
      second = fibonacci;
      n--;
      System.out.println(fibonacci);
    }
    System.out.println();
    System.out.println(fibonacci);
  }
}
