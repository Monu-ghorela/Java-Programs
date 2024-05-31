package condtionalStatemnets.Assgn2;

public class Q2 {

  public static void main(String[] args) {
    int monthnumber = -1;
    ////by the use of if else ladder

    //     else if (monthnumber == 1) System.out.println("month is january");
    //     else if (monthnumber == 2) System.out.println("month is february");
    //     else if (monthnumber == 3) System.out.println("month is march");
    //     else if (monthnumber == 4) System.out.println("month is april");
    //    else  if (monthnumber == 5) System.out.println("month is may");
    //     else if (monthnumber == 6) System.out.println("month is june");
    //     else if (monthnumber == 7) System.out.println("month is july");
    //     else if (monthnumber == 8) System.out.println("month is august");
    //     else if (monthnumber == 9) System.out.println("month is september ");
    //     else if (monthnumber == 10) System.out.println("month is octobor");
    //     else if (monthnumber == 11) System.out.println("month is november");
    //     else if (monthnumber == 12) System.out.println("month is december");

    //     else System.out.println("invalid day number");

    // by the yse of switch

    switch (monthnumber) {
      case 1:
        System.out.println("month is january");
        break;
      case 2:
        System.out.println("month is february");
        break;
      case 3:
        System.out.println("month is march");
        break;
      case 4:
        System.out.println("month is april");
        break;
      case 5:
        System.out.println("month is may");
        break;
      case 6:
        System.out.println("month is june");
        break;
      case 7:
        System.out.println("month is july");
        break;
      case 8:
        System.out.println("month is august");
        break;
      case 9:
        System.out.println("month is september");
        break;
      case 10:
        System.out.println("month is october");
        break;
      case 11:
        System.out.println("month is november");
        break;
      case 12:
        System.out.println("month is december");
        break;
      default:
        System.out.println("invalid day number ");
    }
  }
}
