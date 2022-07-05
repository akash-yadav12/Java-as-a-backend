interface Area {
  final float pi = 3.14F;
  // interface only contains the declaration of methods, this methods are defined in its child classes
  float compute(float radius);
}
// implements keyword is used to inherit interfaces
class Circle implements Area{
  public float compute(float r){
    return (pi*r*r);
  }
}
class Interface{
  public static void main(String args[]){
    Circle c = new Circle();
    System.out.println("Area of circle is: "+ c.compute(10));
  }
} 