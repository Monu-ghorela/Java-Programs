package mockPrograms;

public class StrongNumber {

  public static void main(String[] args) {
    int a[] = { 145, 40585, 123, 7, 720 };

    for (int i = 0; i < a.length; i++) {
      if (isStrong(a[i])) {
        System.out.println("number " + a[i] + " is strong");
      }
    }
  }

  public static boolean isStrong(int number) {
    int sum = 0;
    int orig = number;
    while (number > 0) {
      int digit = number % 10;
      int fact = 1;
      for (int i = 1; i <= digit; i++) {
        fact *= i;
      }
      sum += fact;
      number /= 10;
    }


    if(sum==orig)
    {
        return true;
    }
    return false;
  }
}
