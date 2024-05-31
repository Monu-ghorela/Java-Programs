package Assgn4;

public class Q1 {
    public static void main(String[] args) {
        int num=55454;
        int cnt=0;
       
        while (num!=0) {
            
            num=num/10;
            cnt++;

        }
    
       String ans=num%2==0 ?"even " :"odd";
       System.out.println("this number "+ num+ " is " +ans );
       System.out.println("count of digit is"+ cnt);
    }

}
