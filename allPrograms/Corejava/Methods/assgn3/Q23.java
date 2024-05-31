package Methods.assgn3;

public class Q23 {

  public static void displaySum(int a, int b, int sum) {
    System.out.println(
      "the sum of two numbers  " + a + " and " + b + " is " + sum
    );
  }

  public static void sum(int a, int b) {
    int sum = a + b;
    displaySum(a, b, sum);
  }

  public static void displayProduct(int a, int b, int product) {
    System.out.println(
      "the product of two numbers  " + a + " and " + b + " is " + product
    );
  }

  public static void product(int a, int b) {
    int product = a * b;
    displayProduct(a, b, product);
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 60;
    sum(a, b);
    sum(10, 20);
    sum(20, 75);

    product(a, b);
  }
}
