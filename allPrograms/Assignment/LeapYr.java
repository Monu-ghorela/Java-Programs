import java.util.Scanner;

class LeapYr{
 public static void  main(String []args)
{
Scanner s =new Scanner(System.in);
System.out.println("Enter the year ");
int year =s.nextInt();
if((year%4==0 && year% 100 !=0))
{


System.out.println("it is  a leap year ");
}

else if(year%400==0)
{

System.out.println("it is  a leap year ");

}

else{

System.out.println("This is not a  leap year");

}
}



}