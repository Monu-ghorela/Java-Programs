package TestPatterns;

public class Q14 {

  public static void main(String[] args) {
    int n = 5;
    boolean a = false;
    for (int i = 1; i <= n; i++) {
      if (a) {
        a = false;
      } else {
        a = true;
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (a) {
          System.out.print(1);
          a = false;
        } else {
          System.out.print(0);
          a = true;
        }
      }
      System.out.println();
    }
  }
}
