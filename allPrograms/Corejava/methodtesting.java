public class methodtesting {

  public static int sum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static int product(int a, int b) {
    int product = a * b;
    return product;
  }

  public static void addOf(int a, int b) {
    int sum = sum(a, b) + product(a, b);
    System.out.println(
      "The sum of ,sum of two numbers and product of two numbers is " + sum
    );
  }

  public static void main(String[] args) {
    int a = 20;
    int b = 35;
    // addOf(a, b);
    int sum=sum(sum(a, b), product(a, b));
    System.out.println(
      "The sum of ,sum of two numbers and product of two numbers is " + sum
    );
  }
}
