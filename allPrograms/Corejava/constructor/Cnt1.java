package constructor;

public class Cnt1 {

  protected int i, j;

  Cnt1() {
    System.out.println("constructor called ");
  }

  Cnt1(int i, int j) {
    System.out.println("constructor called ");

    this.i = i;
    this.j = j;
  }

  public static void main(String[] args) {
    cnt2 c1=new cnt2(10,2);
    c1.display();

  }
}

class cnt2 extends Cnt1 {
    cnt2(int i,int j )
    {
        super(i, j);

    }
    void display()
    {
        System.out.println("i= "+i+" j= "+j);
    }
}
