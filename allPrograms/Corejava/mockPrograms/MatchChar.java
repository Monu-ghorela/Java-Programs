package mockPrograms;

public class MatchChar {


    public static boolean match(String str) {
        if ((str.charAt(0)==str.charAt(str.length()-2))&&str.charAt(1)==str.charAt(str.length()-1)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        System.out.println(match("edited"));
    }
}
