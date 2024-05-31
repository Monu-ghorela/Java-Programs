package Arrays.sorting;

public class BubbleSort {

  public static void swap(int[] a, int j) {
    int temp = a[j];
    a[j] = a[j + 1];
    a[j + 1] = temp;
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 5, 1, 5, 1, 2, 3, 3, 7 };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < (a.length - i) - 1; j++) {
        if (a[j] > a[j + 1]) {
          swap(a, j);
        }
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
