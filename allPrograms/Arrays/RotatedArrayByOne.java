package Arrays;

public class RotatedArrayByOne {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 5 };

    int n = 3 ;
    n = n % a.length;

    // for one iterration-------
    // int s = 0;
    // int e = s + 1;

    // while (e != a.length) {
    //   int temp = a[e];
    //   a[e] = a[s];
    //   a[s] = temp;

    //   s++;
    //   e++;
    // }
    // for mnultiple times /----------

    for (int k = 0; k < n; k++) {
      int temp = a[0];
      for (int i = 0; i < a.length - 1; i++) {
        a[i] = a[i+1];
      }
      a[a.length - 1] = temp;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
