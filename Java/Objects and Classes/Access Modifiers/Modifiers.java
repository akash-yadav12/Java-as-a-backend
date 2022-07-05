class Base{
  // default modifier type
  int var1=1;
  // public modifier type
  public int var2 = 2; 
  // private modifier type
  private int var3=3;
  // protected modifier type
  protected int var4= 4;

  public void getter(){
    System.out.println(var1+" "+ var2+ " "+var3+" "+var4); 
  }

  public void setter(int a, int b,int c, int d){
    var1 = a;
    var2 = b;
    var3 = c;
    var4 = d;
  }

}
class Derived extends Base{
  void display(){
    // will throw an error while accesing private property
    // System.out.println(var3)
    // work just fine
    System.out.println(var4);
  }
}
class Modifiers{
  public static void main(String args[]){
    Base obj = new Base();
    obj.setter(10,20,30,40);
    obj.getter();
    // will throw an error as var3 and var4 of class base is only accessible within the class itself
    // System.out.println(obj.var3+" "+obj.var4);
    Derived obj2 = new Derived();
    obj2.display();
    

    // Final keywords is used to create constants
    final int x = 100;
    System.out.println(x);
    // x = 20; // will throw an error

  }
}