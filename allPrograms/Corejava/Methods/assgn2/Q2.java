package Methods.assgn2;

public class Q2 {

  public static void reading(int a, float b) {
    System.out.println(
      "reading (int a,float b) parametrized method is called which is taking int and float type of argument"
    );
  }

  public static void main(String[] args) {
    System.out.println("start");
    reading(5, 5.55f);
    System.out.println(" end");
  }
}
