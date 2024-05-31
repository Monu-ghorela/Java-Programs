package Recursion;

public class R1 {

  public static void m1(int n) {
    if (n < 0) {
      return;
    }
    m1(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    m1(10);
  }
}
