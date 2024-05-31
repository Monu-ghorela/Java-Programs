package Methods.assgn3;

public class Q14 {

  public static void display(int n, int power, int NthPower) {
    System.out.println(
      "the " + NthPower + "th power  of " + n + " is " + power
    );
  }

  public static void powerOfNumber(int n, int NthPower) {
    int power = 1;
    for (int i = 1; i <= NthPower; i++) {
      power *= n;
    }
    display(n, power, NthPower);
  }

  public static void main(String[] args) {
    powerOfNumber(5, 4);
    powerOfNumber(3, 6);
    powerOfNumber(6, 2);
    powerOfNumber(8, 3);
  }
}
