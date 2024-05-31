package String;

public class toArray {
    public static void main(String[] args) {
        String s="java";
        char a[]=new char[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.charAt(i);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
