class Base {
   public void display() {
      System.out.println("Base Class");
   }
}

class Derived extends Base {
   public void display() {
      System.out.println("Derived Class");
   }
}
class Overriding{
  public static void main(String args[]){
    Base b = new Base();
    b.display(); // display method of base class is invoked
    Derived d = new Derived();
    d.display(); // display method of derived class is invoked (overriding its parent's display method)
    // tried something different
    Base x = new Derived();
    x.display();
  }
}