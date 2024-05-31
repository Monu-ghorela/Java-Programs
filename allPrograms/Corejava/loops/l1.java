package loops;

public class l1 {

  public static void main(String[] args) {
    char a = 'A';

    for (int i = 0; i < 25; i++) {
      char c = (char) (a + i);
    }
    System.out.println();
    for (int i = 0; i < 25; i++) {
      if(i==1)
      {
        continue;
      }
      System.out.print("hy ");
    }
    System.out.print(a+"  ");
    
    // System.out.println();
    
    // for (int i = 0; i < 26; i++) {
    //   char c = (char) (a + i);
    //   System.out.println(c);
    //   i++;
    // }

    // System.out.println();

    // char d='Z';
    // for (int i = 0; i < 25; ) {
    //     char e=(char)(d-i);
    //     System.out.println(d);
    //     i++;
    // }
  }
}
