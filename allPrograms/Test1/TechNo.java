package Test1;

/**
 * TechNo
 */
public class TechNo {

  public static void main(String[] args) {
    int n = 4777;
    int n1 = n;
    int temp = n;
    int count = 0;
    while (n > 0) {
      n = n / 10;
      count++;
    }
    if (count % 2 == 0) {
      double firstHalf = temp % (Math.pow(10, count / 2));

      double secondHalf = temp / (Math.pow(10, count / 2));
   
      int ans1 = (int)firstHalf + (int)secondHalf;
      int ans = ans1 * ans1;

   
      if (ans == n1) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    } else {
      System.out.println("no");
    }
  }
}
