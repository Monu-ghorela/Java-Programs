class B extends A{

int id=10;
static{

System.out.println("1st b class static init called");
}

{
System.out.println("1st B class non  static init called");


}
public static void main(String []args){

B b=new B();


}


}