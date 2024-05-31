package condtionalStatemnets.assgn;

public class Q13 {

  public static void main(String[] args) {
    int n = 15;
    // if ((n % 2 == 0) && (n % 3 != 0) || (n % 2 != 0) && (n % 3 == 0))
    //    Syste1.out.println(" number " + n + " is not divisible by 6");
    if(n%2==0 && n%3==0){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
       
  }
}
