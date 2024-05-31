import java.util.Scanner;
class NegativePosZero{

public static void main(String []args)
{
Scanner s=new Scanner(System.in);

System.out.println("Enter a no. to verify neg. ,pos. or zero");
float a=s.nextFloat();
if(a>0){

System.out.println("Number is positive ");


}else if(a<0){
System.out.println("Number is negative ");

}else{
System.out.println("Number is zero ");
}

}
}