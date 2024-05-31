class Swapping{

public static void main(String[] args)
{
//without using temmp variable 



int a=4;
int b=5;

a=a*b;
b=a/b;
a=a/b;

System.out.println(a);
System.out.println(b);


// with using temp var 
int temp=a;
a=b;
b=temp;





}





}