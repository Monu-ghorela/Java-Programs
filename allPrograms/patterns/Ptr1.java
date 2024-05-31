package patterns;

public class Ptr1 {

  public static void main(String[] args) {
    int number = 11;
    for (int i = 0; i < 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("  " + number);
        number++;
      }
      System.out.println();
      number = number + 5;
    }
  }
}
