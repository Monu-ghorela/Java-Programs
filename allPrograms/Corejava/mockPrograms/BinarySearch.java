package mockPrograms;

public class BinarySearch {

  public static int Binarysearch(int[] a, int s, int e, int t) {
    if (s >= e) {
      return -1;
    }
    int mid = s + e / 2;
    if (a[mid] == t) {
      return mid;
    } else if (a[mid] < t) {
      Binarysearch(a, mid + 1, e, t);
    } else {
      Binarysearch(a, s, mid - 1, t);
    }
    return mid;
  }

  public static void main(String[] args) {
    int a[] = { 1, 5, 7 };
    int t = 8;
    int s = 0;
    int e = a.length - 1;

    System.out.println(Binarysearch(a, s, e, t));
  }
}
