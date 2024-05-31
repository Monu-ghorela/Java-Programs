

public class RightRotation {
    public static void main(String[] args) {
        
        int []a={1,2,3,4};
        int n=1;
        n=n%a.length;
        for (int i = 0; i < n; i++) {
            int temp=a[a.length-1];
            for (int j = a.length-1; j >0; j--) {
                a[j]=a[j-1];

            }
            
            a[0]=temp;
        }
        for (int i = 0; i < a.length; i++) {
           System.out.println(a[i]); 
        }
    }
    
}
