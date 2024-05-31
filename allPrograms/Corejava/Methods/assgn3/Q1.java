package Methods.assgn3;

public class Q1 {

  public static void sum(int a, int b) {
    System.out.println("the sum of " + a + " and " + b + " is " + (a + b));
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 20;
    int d = 30;

    sum(a, b);

    sum(c, d);
    sum(c, b);
  }
}
