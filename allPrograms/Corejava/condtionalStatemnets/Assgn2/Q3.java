package condtionalStatemnets.Assgn2;

public class Q3 {

  public static void main(String[] args) {
    int monthNumber = 4;
    //by the use of else if ladder

    // if(monthNumber ==1||monthNumber==3||monthNumber==5||monthNumber==7||monthNumber==8||monthNumber==10||monthNumber==12)
    // System.out.println("month 31 days in  it");
    // else if(monthNumber==4||monthNumber==6||monthNumber==9||monthNumber==11)
    // System.out.println("month has 30 days in it ");
    // else if(monthNumber==2)
    // System.out.println("month has 28 or 29 days in it");
    // else
    // System.out.println("invalid month number  ");

    ///by the use of switch
    switch (monthNumber) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("month has 31 days in it");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("month has 30 days in it");
        break;
      case 2:
        System.out.println("month has  28 or 29 days in it ");
        break;
      default:
        System.out.println("invalid month number ");
    }
  }
}
