package Arrays.sorting;

public class mergeSort {

  public static void merge(int[] a, int s, int e) {
    int mid = (s + e) / 2;
    int l[] = new int[mid - s + 1];
    int r[] = new int[e - mid];

    for (int i = 0; i < l.length; i++) {
      l[i] = a[s + i];
    }
    for (int i = 0; i < r.length; i++) {
      r[i] = a[mid + 1 + i];
    }
    int i = 0;
    int j = 0;
    int k = s;
    while (i < l.length && j < r.length) {
      if (l[i] < r[j]) {
        a[k] = l[i];
        i++;
      } else {
        a[k] = r[j];
        j++;
      }
      k++;
    }
    while (i < l.length) {
      a[k++] = l[i++];
    }
    while (j < r.length) {
      a[k++] = r[j++];
    }
  }

  public static void mergeSort(int a[], int s, int e) {
    int mid = (s + e) / 2;
    if (s >= e) {
      return;
    }
    mergeSort(a, s, mid);
    mergeSort(a, mid + 1, e);
    merge(a, s, e);
  }

  public static void main(String[] args) {
    int[] a = { 1, 5, 2, 3 };
    mergeSort(a, 0, a.length - 1);
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
