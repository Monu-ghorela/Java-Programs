package Assign1;

public class Q8 {

  public static void main(String[] args) {
    int a[] = { 45, 15, 23, 45, 78 };
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      if (i % 2 == 0) {
        sum += a[i];
      }
    }
    System.out.println("sum of elemntz present at even index are " + sum);
  }
}
