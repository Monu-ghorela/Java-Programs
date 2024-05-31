package Methods.assgn3;

public class Q13 {

  public static void cube(int n) {
    System.out.println("the cube of the number " + n + " is " + (n * n * n));
  }

  public static void main(String[] args) {
    int n = 10;
    cube(n);
    cube(12);
    cube(13);
    cube(5);
    cube(2);
    cube(15);
  }
}
