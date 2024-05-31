package Methods.assgn3;

public class Q3 {

  public static void sum(int i,float a, float b) {
    System.out.println("the sum of " + a +","+i+ " and " + b + " is " + (a + b+i));
  }

  public static void main(String[] args) {
    int i=10;
    float a = 10.00f;
    float b = 20.5f;
    float c = 20.55f;
    float d = 30.44f;

    sum(i,a, b);

    sum(i,c, d);
    sum(i,c, b);
  }
}
