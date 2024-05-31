package Methods.assgn3;

public class Q8 {

  public static void productOfDigits(int a) {
    int product = 1;
    int orig = a;
    while (a > 0) {
      product *= (a % 10);

      a /= 10;
    }
    Display(orig, product);
  }

  public static void Display(int a, int product) {
    System.out.println("the product of digits of " + a + " is " + product);
  }

  public static void main(String[] args) {
    int number = 153;
    productOfDigits(number);
    productOfDigits(143);
    productOfDigits(1432);
  }
}
