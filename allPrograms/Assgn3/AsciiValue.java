import java.util.Scanner;

class AsciiValue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a character to check the ascii value");
        String st=s.next();
        char character=st.charAt(0);
        int val=(int)character;
        System.out.println(+character);

    }
}
