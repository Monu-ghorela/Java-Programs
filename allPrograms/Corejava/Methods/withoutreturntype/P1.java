package Methods.withoutreturntype;

public class P1 {

  static int add(int a, int b) {
    System.out.println(" method with return is calling ");
    return (a + b);
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int sum = add(a, b);
    System.out.println("sum of " + a + " and " + b + " is " + sum);
  }
}
