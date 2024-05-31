class CharOrNumber {

  public static void main(String[] args) {
    char character = '3';
    if (
      character == 'a' || character == 'e' ||
      character == 'i' ||
      character == 'o' ||
      character == 'u'
    ) {
      System.out.println("this is a vowel");
    } else if (
      character > 'a' && character <= 'z' || character > 'A' && character <= 'Z'
    ) {
      System.out.println("this is a consonant");
    } else {
      System.out.println("this is a number");
    }
  }
}
