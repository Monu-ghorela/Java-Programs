package String;

public class UpperAndLowerConversion {
    public static void main(String[] args) {
        String s="Monu Ghorela";
        String s1="";
        for (int i = 0; i <s.length(); i++) {
            
        int num=s.charAt(i);
        if(num>64&&num<91)
        {
            num+=32;
        }else{
            num-=32;
        }
        s1+=(char)num;


        }
        System.out.println(s1);
    }
}
