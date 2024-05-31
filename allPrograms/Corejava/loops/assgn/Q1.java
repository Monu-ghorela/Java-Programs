package loops.assgn;

public class Q1 {

  public static void main(String[] args) {
    // by the help oo for loop
    for (char i = 'A'; i <= 'I'; i++) {
      System.out.println(i);
    }
    /// with the help of while loop
    char i = 'A';
    while (i <= 'I') {
      System.out.println(i++);
    
    }
    /// with the help of while loop
    char j = 'A';
    do {
      System.out.println(j++);
    } while (j <= 'I');
  }
}
