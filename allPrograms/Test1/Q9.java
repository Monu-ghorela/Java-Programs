package Test1;

//// tech number
public class Q9 {

  public static void main(String[] args) {
    int n = 2025;
    int orig = n;
    int temp = n;
    int count = 0;
    while (temp > 0) {
      temp /= 10;
      count++;
    }
    System.out.println(count);
    if (count % 2 == 0) {
      int divider = 1;
      for (int i = 1; i <= count / 2; i++) {
        divider *= 10;
      }
      int firstHalf = n % divider;
      int secondHalf = n / divider;
      if ((firstHalf + secondHalf) * (firstHalf + secondHalf) == orig) {
        System.out.println(" thids sis a tech no");
      } else {
        System.out.println(" this is nlot a tech no");
      }
    } else {
      System.out.println(" it is not a tech no");
    }
  }
}
