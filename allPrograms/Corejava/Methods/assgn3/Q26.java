package Methods.assgn3;

public class Q26 {

  public static void display(int l, int u, int sum) {
    System.out.println(
      "the sum of prime numbers from " + l + " to " + u + " is " + sum
    );
  }

  public static boolean isPrime(int n) {
    if (n==1) {
        return false;
        
    }
    if (n == 2) {
      return true;
    }

    for (int i = 2; i <n; i++) {
        if (n%i==0) {
            return false;
            
        }
    }

    return true;
  }

  public static void sumOfPrimeNumbers(int l, int u) {
    int sum = 0;
    for (int i = l; i <= u; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    display(l, u, sum);
  }

  public static void main(String[] args) {
    sumOfPrimeNumbers(1, 20);
  }
}
