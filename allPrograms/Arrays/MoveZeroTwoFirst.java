package Arrays;

public class MoveZeroTwoFirst {

  public static void main(String[] args) {
    int[] a = { 1, 0, 5, 0, 0, 5, 0, 5 };

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        for (int j = i; j > 0; j--) {
          a[j] = a[j - 1];
        }
        a[0] = 0;
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
