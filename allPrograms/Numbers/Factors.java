package Numbers;

public class Factors {
    public static void main(String[] args) {
        
        int number=4;
        for (int i = number; i >=1; i--) {
            if(number%i==0)
            {
                System.out.print(i+ " ");
            }

        }
    }
    
}
