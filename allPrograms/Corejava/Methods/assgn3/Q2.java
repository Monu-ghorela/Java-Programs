package Methods.assgn3;

public class Q2 {

  public static void sum(float a, float b) {
    System.out.println("the sum of " + a + " and " + b + " is " + (a + b));
  }

  public static void main(String[] args) {
    float a = 10.00f;
    float b = 20.5f;
    float c = 20.55f;
    float d = 30.44f;

    sum(a, b);

    sum(c, d);
    sum(c, b);
  }
}
