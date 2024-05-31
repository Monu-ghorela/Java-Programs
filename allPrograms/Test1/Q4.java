package Test1;

public class Q4 {

  public static void main(String[] args) {
    int n = 5;
    int orig = n;
    int temp = n;
    int count = 0;
    while (temp > 0) {
      count++;
      temp /= 10;
    }
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      int power = 1;
      for (int i = 1; i <= count; i++) {
        power = power * digit;
      }
      sum = sum + power;
      n/=10;
    }
    if(sum==orig)
    {
        System.out.println("this is a armstrong number");
    }else{
        System.out.println("this is not a armstrong number");
    }
  }
}
