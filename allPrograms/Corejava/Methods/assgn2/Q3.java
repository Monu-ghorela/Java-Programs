package Methods.assgn2;

public class Q3 {

  static void playing(boolean b, float f, double d) {
    System.out.println(
      "playing (boolean b,float f, double d ) parametrized method is called which is taking boolean ,float,double type of arguments"
    );
  }

  public static void main(String[] args) {
    System.out.println("start");
    playing(false, 50.05f, 50.05);
    playing(false, (float) (50.05), 50.05);

    System.out.println("end");
  }
}
