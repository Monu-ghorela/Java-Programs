import java.util.Scanner;


public class LowrUprChar {
    
    public static void main(String[] args) {
        System.out.println("ener a character");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>=65&& c<=90){


            System.out.println("chracter is a upper case letter ");
        }
        else if(c>=97&&c<=122){
            System.out.println("chracter is a lower case letter ");

        }else{
            System.out.println("this is a number or aby other symbol");
        }


    }
}
