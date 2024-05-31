package Arrays;

/**
 * SumOfAMaxAndMin
 */
public class SumOfAMaxAndMin {

  public static void main(String[] args) {
    int a[] = { 1, 5, 3, 6, 8 };
    int max = a[0];
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
      if (a[i] < min) {
        min = a[i];
      }
    }
    System.out.println(" the sum of max and min is"+(max+min));
    
  

}
}
