package mockPrograms;

public class maximumSubArray {

  public static void main(String[] args) {
    int a[] = { 1, 2, 5, 8, 6, -10 };
    int largestSum = a[0];
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < a.length; j++) {
        int sum = 0;
        for (int j2 = i; j2 <= j; j2++) {
          sum += a[i];
        }
        if (sum > largestSum) {
          largestSum = sum;
        }
      }
    }
    System.out.println(largestSum);
  }
}
