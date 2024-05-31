package Recursion;

public class BinarySearch {

  public static void main(String[] args) {
    int array[] = { 2,5};
    int num = 5;
    boolean ans = false;
    int start = 0;
    int end = array.length - 1;
    int index=0;
    while (start <= end) {
      int mid = start + end / 2;
      if (array[mid] == num) {
        // System.out.println("Element found at index "+mid);
        index=mid;
        ans = true;
        break;
      } else if (num < array[mid]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    if (ans) {
      System.out.println("Element found at index " + index);
    }
    else{
        System.out.println("element not presnet in the array");
    }
  }
}
