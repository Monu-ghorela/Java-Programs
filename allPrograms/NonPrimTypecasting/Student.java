public class Student extends College{
int id;
String name;


public static void main(String[] args){


College c=new Student();////upcasting
System.out.println(c.name);


Student s=(Student)(new College());//downcasting
System.out.println(s);





}

}