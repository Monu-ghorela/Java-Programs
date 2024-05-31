package loops.assgn;

public class Q8 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='O'; i+=2) {
            System.out.println(i);
            
        }
        System.out.println();
        char i='A';
        while (i<='O') {
            System.out.println(i);
            i+=2;
        }
        System.out.println();
        char j='A';
        do{
            System.out.println(j);
            j+=2;

        }while(j<='K');
    }
}
