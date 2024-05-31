package String;

public class ToUpperCase {
    public static void main(String[] args) {
        String s="jAva";
        String s2="";
        for (int i = 0; i < s.length(); i++) {
          int num=s.charAt(i);
          
          if(num>96&&num<123){
            num-=32;
          }
          s2+=(char)num;
        }
        System.out.println(s2);
    }
}
