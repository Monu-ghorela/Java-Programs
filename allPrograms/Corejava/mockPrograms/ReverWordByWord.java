package mockPrograms;

public class ReverWordByWord {

    public static void addword(String word,String str)
    {
        str+=word.reverse();
        word="";
    }
  public static void main(String[] args) {
    String str = "hello world";
    String Str2 = "";
    String word="";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        str += ' ';
        addword(word,str);
        word="";
      }
      else{
        word+=str.charAt(i);
      }
    }
  }
}
