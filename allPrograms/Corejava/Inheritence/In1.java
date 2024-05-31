package Inheritence;

public class In1 {

  static int i;
  int b;

  void input(int k) {
    this.i = k;
    this.b = k;
  }

  void display() {
    System.out.println("i= " + i + " " + "b=  " + b);
  }

  public static void main(String[] args) {
    Derived a = new Derived();
    a.input(10);
    a.display();

    a.input(50);
    a.display2();
    Derived2 b = new Derived2();
    b.input3(50);
    b.display3();
  }
}

class Derived extends In1 {

  int k;

  void input2(int k) {
    this.k = k;
  }

  void display2() {
    System.out.println("k= " + k);
  }
}

class Derived2 extends Derived {

  // int k;

  void input3(int k) {
    this.k = k;
  }

  void display3() {
    System.out.println("k= " + k+" "+ i);
  }
}
