package modifiers.accmodifiers;

public class Q1 {

  private static void m1() {
    System.out.println(" 1.  private  method called");
  }

  public static void m2() {
    System.out.println("2. method called ");
  }

  protected void m3() {
    System.out.println("3. protected method clled");
  }

  protected static void m4() {
    System.out.println("4. static protected method called");
  }

  public static void main(String[] args) {
    m1();
    InnerQ1.main(args);
  }
}

/**
 * InnerQ1
 */
class InnerQ1 {

  public static void main(String[] args) {
    Q1 a = new Q1();
    Q1.m2();
    a.m3();
    // a.m1();
    Q1.m4();
  }
}
