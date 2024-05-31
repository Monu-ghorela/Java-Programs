package Arrays;

public class MoveZerosToLast {

  public static void swap(int[] Arr2, int i, int j) {
    int temp = Arr2[j];
    // System.out.println(temp);
    Arr2[j] = Arr2[i];
    Arr2[i] = temp;
    return;
  }

  public static void main(String[] args) {
    int[] a = { 1, 0, 0, 5,0 };

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        for (int j = i + 1; j <= a.length - 1; j++) {
          if (a[j] != 0) {
            swap(a, i, j);
            break;
          }
        }
      }
    }

    // int j = 0;
    // for (int i = 0; j < b.length; j++) {
    //   if (a[j] != 0) {
    //     b[i++] = a[j];
    //   }
    // }

    // while (j < a.length) {
    //   b[j++] = 0;
    // }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
