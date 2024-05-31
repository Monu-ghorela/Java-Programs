package methodOverloading;

public class P1 {

  static void add() {
    System.out.println(" add method is called");
  }

  static void add(int a, int b) {
    System.out.println("the sum of" + a + " and " + b + " is " + (a + b));
  }

  static void add(int a, int b, int c) {
    System.out.println(
      "the sum of" + a + " , " + b + " and " + c + " is " + (a + b + c)
    );
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 50;
    int d = 70;
    add();
    add(a, b);
    add(a, b, c);
  }
}
