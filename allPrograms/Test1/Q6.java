package Test1;
//// perfect nummber 
public class Q6 {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        for (int i = 1; i <n; i++) {
            
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("perfect number ");
        }else{
            System.out.println(" this is not a perfect number");
        }
        
    }
    



}
