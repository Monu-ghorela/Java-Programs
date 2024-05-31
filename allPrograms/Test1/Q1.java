package Test1;
//// fibonacci series 
public class Q1 {
    public static void main(String[] args) {
        int start=0;
        int end=1;
        int n=4;
        int fibonacci=0;

        if(n==1)
        {
            System.out.println(start);
        }
        if (n==2) {
            
            System.out.println(end);
        }
        else{
            for (int i = 2; i <n; i++) {
                fibonacci=start+end;
                start=end;
                end=fibonacci;
                
            }
        }
        System.out.println(fibonacci);

    }
}
