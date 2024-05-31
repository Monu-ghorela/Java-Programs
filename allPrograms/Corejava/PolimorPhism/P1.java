package PolimorPhism;

public class P1 {

  int i;
  int j;
  int k;

  void input(int i, int j) {
    this.i = i;
    this.j = j;
  }

  void input(int k) {
    this.k = k;
  }

  void display() {
    System.out.println("i= " + i + " j= " + j + " k= " + k);
  }

  public static void main(String[] args) {
    P1 p = new P1();
    p.input(10, 20); //method overloading
    p.input(50); //method overloading
    p.display();
    derived d1 = new derived();
    d1.input(10, 20);
    d1.input(20);//Override
    d1.display();
    p.display();
  }
}

class derived extends P1 {

  int k;

  void input(int k) {
    super.input(k);
    this.k = k;
  }

  void display() {
    super.display();
    System.out.println("i= " + i + " j= " + j + " k= " + k);
  }
}
