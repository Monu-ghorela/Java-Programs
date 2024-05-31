import java.util.Scanner;
public class SumGreat50 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: to add");
        int num1=sc.nextInt();
          System.out.println("Enter a second number: to add");
        int num2=sc.nextInt();
        int sum=num1+num2;
        if(sum>50){
            System.out.println("sum of the numbers is greter than 50");
        }else{
            System.out.println("sum of number is equal to 50 or less than 50");
        }


    }
}
