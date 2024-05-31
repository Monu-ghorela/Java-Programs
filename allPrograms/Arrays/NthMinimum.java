package Arrays;

public class NthMinimum {

  public static void main(String[] args) {
    int[] a = { 4, 5, 45, 23, 5 };
    int n=4;

    // int[] b = new int[a.length];
    // for (int i = 0; i < b.length; i++) {
    //   b[i] = a[i];
    // }
    // int n = 4;
    // int NthMin =a[0];
    // for (int i = 0; i < n; i++) {
    //   int min = a[0];
    //   int change = 0;
    //   for (int j = 0; j < a.length; j++) {
    //     if (b[j] < min) {
    //       min = b[j];
    //       change = j;
    //     }
    //   NthMin = min;
    //   b[change] = 0;
    //   }
    // }
    // System.out.println(NthMin);

    //------------ by using sorting

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < (a.length - i) - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
      }
    }
    int NthMinimum=a[n-1];
    System.out.println(NthMinimum);

}
}
