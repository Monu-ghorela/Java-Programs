import java.util.Scanner ;
 class IfElseLadder{


public static void main(String[] args){

Scanner s=new Scanner(System.in);
System.out.println("enter ur budget");
int budget=s.nextInt();


if((budget>=10000) && (budget<=15000)){


System.out.println("goa");
}
else if((budget>=50000) &&  (budget<=60000)){


System.out.println("maldievs");
}
else if((budget>=5000) &&  (budget<=7000)){


System.out.println("manali");
}
else{
System.out.println("home");
}

}

} 