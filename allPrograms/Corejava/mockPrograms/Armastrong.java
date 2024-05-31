package mockPrograms;

public class Armastrong {

  public static void main(String[] args) {
    int n = 153;
    int orig = n;
    int temp = n;
    int cnt = 0;
    while (temp > 0) {
      cnt++;
      temp /= 10;
    }
    int sum = 0;

    while (n > 0) {
      int digit = n % 10;
      int pow = 1;

      for (int i = 1; i <= cnt; i++) {
        pow *= digit;
      }
      sum += pow;
      n /= 10;
    }
    if (sum==orig) {
        System.out.println("armstrong number ");
        
    }else{
        System.out.println("not a armstrong");
    }
  }
}
