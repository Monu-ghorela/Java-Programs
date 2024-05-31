package mockPrograms;

public class SumOfNUmberInString {

  public static void main(String[] args) {
    String a = "123xy1i9koz";

    int sum = 0;
    for (int i = 0; i <a.length(); i++) {
        if (a.charAt(i)>=48&&a.charAt(i)<=57) {
            String s2="";
            for (int j = i; j <a.length(); j++) {
                if (a.charAt(i)>=48&&a.charAt(i)<=57) {
                    s2+=a.charAt(i);
                    i++;
                    
                }
                else{
                    break;
                }
                
            }
            sum+=Integer.parseInt(s2);
        }
        
    }
    System.out.println(sum);

  }
}
