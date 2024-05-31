package condtionalStatemnets.Assgn2;

//check if chacr is vowel or consonant or not
public class Q4 {

  public static void main(String[] args) {
    char ch = '$';
    // by the use of else if ladder
    // if (
    //   ch == 'a' ||
    //   ch == 'e' ||
    //   ch == 'i' ||
    //   ch == 'o' ||
    //   ch == 'u' ||
    //   ch == 'A' ||
    //   ch == 'E' ||
    //   ch == 'O' ||
    //   ch == 'I' ||
    //   ch == 'U'
    // ) System.out.println("the char is vowel"); else if (
    //   ch == 'b' ||
    //   ch == 'c' ||
    //   ch == 'd' ||
    //   ch == 'f' ||
    //   ch == 'g' ||
    //   ch == 'h' ||
    //   ch == 'k' ||
    //   ch == 'j' ||
    //   ch == 'l' ||
    //   ch == 'm' ||
    //   ch == 'n' ||
    //   ch == 'r' ||
    //   ch == 'p' ||
    //   ch == 'q' ||
    //   ch == 's' ||
    //   ch == 't' ||
    //   ch == 'v' ||
    //   ch == 'w' ||
    //   ch == 'x' ||
    //   ch == 'y' ||
    //   ch == 'z' ||
    //   ch == 'B' ||
    //   ch == 'C' ||
    //   ch == 'D' ||
    //   ch == 'F' ||
    //   ch == 'G' ||
    //   ch == 'H' ||
    //   ch == 'J' ||
    //   ch == 'K' ||
    //   ch == 'L' ||
    //   ch == 'M' ||
    //   ch == 'N' ||
    //   ch == 'P' ||
    //   ch == 'Q' ||
    //   ch == 'R' ||
    //   ch == 'S' ||
    //   ch == 'T' ||
    //   ch == 'V' ||
    //   ch == 'W' ||
    //   ch == 'X' ||
    //   ch == 'Y' ||
    //   ch == 'Z'
    // ) System.out.println(
    //   " the character is consonant"
    // ); else System.out.println("invalid character");

    ///by the use of  switch
    switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("the char is vowel");
        break;
      case 'b':
      case 'c':
      case 'd':
      case 'f':
      case 'g':
      case 'h':
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'n':
      case 'p':
      case 'q':
      case 'r':
      case 's':
      case 't':
      case 'v':
      case 'w':
      case 'x':
      case 'y':
      case 'z':
      case 'B':
      case 'C':
      case 'D':
      case 'F':
      case 'G':
      case 'H':
      case 'J':
      case 'K':
      case 'L':
      case 'M':
      case 'N':
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
      case 'T':
      case 'V':
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
      System.out.println("the char is consonant");
      break;
      default:System.out.println("the char is invalid");
    }
  }
}
