package Test1;
//pefect sqaure 
public class Q8 {

  public static void main(String[] args) {
    int n = 16;
 
    boolean ans=false;

   
      for (int i = 1; i <= n; i++) {
        if(i*i==n)
        {
            ans=true;
            break;
        }
      
    }
    if(ans)
    {
      System.out.println(" it is a perfect sqare ");
    }else{
      System.out.println(" this is not a perfect sqaure");
    }
  }
}
