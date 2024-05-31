package Test1;

public class Q2 {
    //nth prime no
    public static void main(String[] args) {
        int n=1;
        int count =0;
        int nthPrime=1;
        
        for (int i = 1; count!=n; i++) {
           int count2 =0;
           for (int j = 1; j <=i; j++) {
            if(i%j==0)
            {
                count2++;
            }
           }
           if(count2==2){
            count++;
            nthPrime=i;
           }
        
       }
       System.out.println(nthPrime);
    }
}
