package StaticNonStatic;

public class St1 {

  int i;

  private static int n = 5;

  void change() {
    
    i = 10;
    n = 10;
  }

  static void change2() {
    n = 10;
  }

  void display() {
    System.out.println("i= " + i + " " + " n= " + n);
  }

  public static void main(String[] args) {
    // System.out.println(n);
    St1 s1 = new St1();
    s1.change();
    s1.display();
    St1 s2 = new St1();
    change2();
    n=50;
    System.out.println(n);
    s2.display();
    // s1.i = 10;
    // System.out.println(s2.i);
    // System.out.println(s1.i);
  }
}
