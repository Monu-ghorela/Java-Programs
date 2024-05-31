package constructor;

public class Cnt2 {

  int id;
  String name;

  Cnt2() {
    System.out.println("constructor called");
  }

  Cnt2(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    Cnt2 c1 = new Cnt2();
    Cnt2 c2 = new Cnt2(1, "Monu ");
    System.out.println(
      "the id of first one is " +
      c1.getId() +
      " and name of first one is " +
      c1.getName()
    );

    System.out.println(
      "the id of second one is " +
      c2.getId() +
      " and name of second one is " +
      c2.getName()
    );
  }
}
