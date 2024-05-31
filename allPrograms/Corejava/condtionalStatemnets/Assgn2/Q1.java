package condtionalStatemnets.Assgn2;

public class Q1 {

  public static void main(String[] args) {
    int dayNumber = 2;
    ////by the use of if else ladder

    //     if (dayNumber == 1) System.out.println("today is sunday");
    //     else if (dayNumber == 2) System.out.println("today is monday");
    //     else if (dayNumber == 3) System.out.println("today is tuesday");
    //     else if (dayNumber == 4) System.out.println("today is wednesday");
    //     else if (dayNumber == 5) System.out.println("today is thrusday");
    //    else  if (dayNumber == 6) System.out.println("today is friday");
    //     else if (dayNumber == 7) System.out.println("today is saturay");
    //     else System.out.println("invalid day number");

    // by the yse of switch

    switch (dayNumber) {
      case 1:
        System.out.println("today is monday");
        break;
      case 2:
        System.out.println("today is monday");
        break;
      case 3:
        System.out.println("today is monday");
        break;
      case 4:
        System.out.println("today is monday");
        break;
      case 5:
        System.out.println("today is monday");
        break;
      case 6:
        System.out.println("today is monday");
        break;
      case 7:
        System.out.println("today is monday");
        break;
        default:System.out.println("invalid day number ");
    }
  }
}
