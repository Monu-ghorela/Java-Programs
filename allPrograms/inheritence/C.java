class C extends B{


{

System.out.println("1st C class non  static init called");

}
{
System.out.println("2nd C class non  static init called");


}
public static void main(String []args)
{
B b=new B();
C c=new C();
}

}