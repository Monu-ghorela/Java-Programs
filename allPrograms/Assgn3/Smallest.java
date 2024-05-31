import java.util.Scanner;
public class Smallest {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.println("enter a first no ");
int a =sc.nextInt();
System.out.println("enter a second no ");
int b =sc.nextInt();
if(a<b){
    System.out.println("smallest number is " +a);

}else{
        System.out.println("smallest number is " +b);

}

 }   
}
