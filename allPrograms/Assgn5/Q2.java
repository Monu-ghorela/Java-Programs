package Assgn5;

public class Q2 {
    public static boolean isLdigit7(int num)
    {
        int digit=num%10;
        if(digit==7)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number=14;
        if((number%7==0)||isLdigit7(number)){
            System.out.println("buzz number");
        }else{
            System.out.println("it is not a buzz number");
        }
    }
    
}
