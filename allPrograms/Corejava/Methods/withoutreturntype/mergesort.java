package Methods.withoutreturntype;

public class mergesort {

  static void merge(int[] a, int start, int end) {
    int mid = (start + end) / 2;
    int l[] = new int[mid - start+1];
    int r[] = new int[end - mid];
    for (int i = 0; i < r.length; i++) {
      r[i] = a[mid + i + 1];
    }
    for (int i = 0; i < l.length; i++) {
      l[i] = a[start + i];
    }
    int i = 0;
    int j = 0;
    int k = start;
    while (i < l.length && j < r.length) {
      if (l[i] < r[j]) {
        a[k] = l[i];
        i++;
      } else {
        a[k] = r[j];
        j++;
        // k++;
      }
      k++;
    }
    while (i < l.length) {
      a[k] = l[i];
      k++;
      i++;
    }
    while (j < r.length) {
      a[k] = r[j];
      j++;
      k++;
    }
  }

  static void Mergesort(int[] a, int start, int end) {
    int mid = (start + end) / 2;
    if (start >= end) {
      return;
    }
    Mergesort(a, start, mid);
    Mergesort(a, mid + 1, end);
    merge(a, start, end);
  }

  public static void main(String[] args) {
    int[] a = { 1, 5, 2, 3 };
    Mergesort(a, 0, a.length - 1);
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
