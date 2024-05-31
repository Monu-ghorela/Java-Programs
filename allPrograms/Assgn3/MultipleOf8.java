import java.util.Scanner;
public class MultipleOf8 {
    public static void main(String[] args) {
        
        System.out.println("enter a no to check that is a mnultiple of 8 or not");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        if(number%8==0)
        {
            System.out.println("this is  a mnultiple of 8 ");
        
        }
        else{
                System.out.println("this is not  a mnultiple of 8 ");
        
        }
    }
    
}
