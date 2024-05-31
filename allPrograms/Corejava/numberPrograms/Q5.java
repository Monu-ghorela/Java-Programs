package numberPrograms;
/// power of a  number 
public class Q5 {
    public static void main(String[] args) {
        int n=5;
        int pow=3;
        int power=1;
        int i=1;
        while (i<=pow) {
            power*=n;
            i++;
        }
        System.out.println(power);
    }
}
