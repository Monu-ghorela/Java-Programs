import java.util.Scanner;
class MaximumOfThree{

public static void main(String []args){

Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b){

       if(a>c){



             System.out.println("greatest number is "+ a);
           }else{
                  System.out.println("greatest number is "+ c);

             }



}else if(b>c)   {
           System.out.println("greatest number is "+ b);

            }else{

   System.out.println("greatest number is "+ c);
                }


                }



}