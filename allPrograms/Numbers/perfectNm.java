package Numbers;

public class perfectNm {

  public static void main(String[] args) {
    int num =10 ;
    int sum = 0;
    for (int i = num-1; i >= 1; i--) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    if (sum == num) {
      System.out.println("i  is a perfct num");
    } else {
      System.out.println("it is ot a perfect");
    }
    System.out.println(sum);
  }
}
