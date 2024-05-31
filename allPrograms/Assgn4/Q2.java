///number of prime no. in series
package Assgn4;

public class Q2 {

  public static void main(String[] args) {
    int n = 100;
    for (int i = 2; i <= n; i++) {
      boolean ans = true;
      
      for (int j = 2; j <= i - 1; j++) {
        if (i == 2) {
          break;
        } 
        else if(i==1){
            ans=false;
            break;       
         }
        else if (i % j == 0) {
          ans = false;
          break;
        }
      }
      if (ans) {
        System.out.println(i);
      }
    }
  }
}
