package Methods.assgn3;

public class Q24 {
    public static void display(int l,int u,int sum) {
        System.out.println("the sum of even numbers from "+l+" to "+ u+" is "+sum);
        
    }
public static boolean isEven(int n) {
    if(n%2==0)
    {
        return true;
    }
    return false;
    
}
  public static void sumOfEvenNumbers(int l, int u) {
    int sum = 0;
    for (int i = l; i <= u; i++) {
      if (isEven(i)) {
        sum+=i;

      }
    }
    display(l,u,sum);
  }

  public static void main(String[] args) {
    sumOfEvenNumbers(1, 10);
  }
}
