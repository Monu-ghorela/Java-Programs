package Methods.assgn3;

public class Q5 {

  public static void sum(short a, short b) {
    System.out.println("the sum of " + a + " and " + b + " is " + (a + b));
  }

  public static void main(String[] args) {
    short a = (short)(32768);
    short b = (short)(125);
    short c = (short)(32767);
    short d = (short)(35888);

    sum(a, b);

    sum(c, d);
    sum(c, b);
  }
}
