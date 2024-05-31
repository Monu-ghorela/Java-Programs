package loops.assgn;

public class Q9 {

  public static void main(String[] args) {
    for (char i = 'Z'; i >= 'M'; i--) {
      System.out.println(i);
    }
    System.out.println();
    char i = 'A';
    while (i >= 'M') {
      System.out.println(i);
      i--;
    }
    System.out.println();
    char j = 'Z';
    do{
        System.out.println(j--);
    }while(j>='M');
  }
}
