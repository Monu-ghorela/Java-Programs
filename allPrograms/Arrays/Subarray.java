package Arrays;

public class Subarray {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 8, 5, 6 };
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < a.length; j++) {
        for (int j2 = i; j2 <= j; j2++) {
          System.out.print(a[j2] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
