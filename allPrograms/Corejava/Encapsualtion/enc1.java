package Encapsualtion;

// encapsulation provides the security to the data members //// data members and method bind within the class .
public class enc1 {

  int i;

  void input(int i) {
    this.i = i;
  }

  void display() {
    System.out.println("i = " + i);
  }

  public static void main(String[] args) {
    enc1 e1 = new enc1();

    // e1.i=10;       //dont use this way to alocate the value in encapsulation
    e1.input(10); ///this way is private method to allocate the value
    e1.display();
  }
}
