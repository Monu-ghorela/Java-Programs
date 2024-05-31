package Methods.assgn2;

public class Q4 {

  static void study(int a, int b, float f, double d) {
    System.out.println(
      "study(int a,int b,float f,double d) parametrized method is called which is taking int ,float and doublw type of argument  "
    );
    return;
  }

  public static void main(String[] args) {
    System.out.println(" start");
    study(10, 20, 30.05f, 50.21);
    System.out.println("end");
  }
}
