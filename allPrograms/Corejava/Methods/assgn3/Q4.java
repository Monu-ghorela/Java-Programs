package Methods.assgn3;

public class Q4 {

  public static void sum(byte a, byte b) {
    System.out.println("the sum of " + a + " and " + b + " is " + (a + b));
  }

  public static void main(String[] args) {
    byte a = (byte)(128);
    byte b = (byte)(125);
    byte c = (byte)(130);
    byte d = (byte)(30);

    sum(a, b);

    sum(c, d);
    sum(c, b);
  }
}
