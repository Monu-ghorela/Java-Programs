package Arrays;

public class ArmstrongNumbersInArray {

  public static int power(int base, int pow) {
    int powerOfNum = 1;
    for (int i = 1; i <= pow; i++) {
      powerOfNum = powerOfNum * base;
    }
    return powerOfNum;
  }

  public static boolean IsArmstrong(int number) {
    int temp = number;
    int count = 0;
    int temp2 = number;

    while (temp > 0) {
      count++;
      temp = temp / 10;
    }
    int sum = 0;
    while (temp2 > 0) {
      int digit = temp % 10;
      sum = sum + power(digit, count);
      temp2 = temp2 / 10;
    }
    if (sum == number) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 23, 45 };
    for (int i = 0; i < a.length; i++) {
      if (IsArmstrong(a[i])) {
        System.out.println(a[i] + "armstrong");
      }
    }
  }
}
