package Methods.assgn3;

public class Q21 {

  public static void display(int totMarks, double percent) {
    System.out.println("the total marks of ashish is "+totMarks);
    System.out.println(" the perecentage of total marks obtained by ashish is "+percent +"%");
  }

  public static void avg(int sc, int socSoc, int mth, int eng, int hindi) {
    int totMarks = sc + socSoc + mth + eng + hindi;
  
  
    double percent = ((sc + socSoc + mth + eng + hindi)* 100/500);
    display(totMarks, percent);
  }

  public static void main(String[] args) {
int sc=78;
int socSoc=89;
int mth=99;
int eng=88;
int hindi=67;
avg(sc, socSoc, mth, eng, hindi);



  }
}
