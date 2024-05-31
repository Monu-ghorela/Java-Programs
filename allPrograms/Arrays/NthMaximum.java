package Arrays;

public class NthMaximum {

  public static void main(String[] args) {
    int[] a = { 4, 5, 45, 23, 5 };
    // int[] b = new int[a.length];
    // for (int i = 0; i < b.length; i++) {
    //   b[i] = a[i];
    // }
    // int n = 4;
    // int NthMax = 0;
    // for (int i = 0; i < n; i++) {
    //   int max = a[0];
    //   int change = 0;
    //   for (int j = 0; j < a.length; j++) {
    //     if (b[j] > max) {
    //       max = b[j];
    //       change = j;
    //     }
    //   NthMax = max;
    //   b[change] = 0;
    //   }
    // }
    // System.out.println(NthMax);

    ///--------by using sorting
    int n = 2;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < (a.length - i) - 1; j++) {
        if (a[j] < a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    int NthMax = a[n-1];
    System.out.println(NthMax);
  }
}
