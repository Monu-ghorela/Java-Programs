package Numbers;

public class Armstrong {
  public static void main(String[] args) {
    int n = 153;
    int orig = n;
    int temp = n;
    int cnt = 0;
    while (temp > 0) {
      temp = temp / 10;
      cnt++;
    }
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      int power = 1;
      for (int i = 1; i <= cnt; i++) {
        power = power * digit;
      }

      sum = sum + power;
      n = n / 10;
    }
    if (orig == sum) {
      System.out.println("it is a armstrong no");
    } else {
      System.out.println("it is not a armstrong");
    }
    System.out.println(sum);
  }
}
