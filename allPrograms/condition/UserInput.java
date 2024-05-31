import java.util.Scanner;  
class UserInput{


public static void main(String[] args){
   
Scanner s=new Scanner(System.in);
//number
System.out.println("enter a number ");
int number=s.nextInt();
System.out.println(number);
//String
System.out.println("enter a charater ");
String character=s.next();
System.out.println(character);
//Full string
System.out.println("enter a full name ");
String name=s.nextLine();
//String roll=s.nextLine();
System.out.println(name);
}

} 